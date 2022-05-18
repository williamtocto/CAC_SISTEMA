package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloCredito extends Credito {

    ConexionPG con = new ConexionPG();
    Modelo_Socio socio = new Modelo_Socio();

    public ModeloCredito(String deudor, String cedulaD, int codigoD, int codigoG1, int codigoG2, String cedulaG1, String cedulaG2, String Garante1, String Garante2, int codigo, double capital, float interes, int plazo, String fecha, String observacion, String estado, String fecha_fin) {
        super(deudor, cedulaD, codigoD, codigoG1, codigoG2, cedulaG1, cedulaG2, Garante1, Garante2, codigo, capital, interes, plazo, fecha, observacion, estado, fecha_fin);
    }

    public ModeloCredito() {
    }

    public boolean grabarCredito() {
        String sql = "";
        if (getCodigoG2() != 0 && getCodigoG1() != 0) {
            // Aqui se va a guaradar los 2 garantes
            sql = "Insert into credito (cod_socio,garante_1,garante_2,capital,tasa_interes,plazo_meses,"
                    + "fecha_credito,fecha_finalizacion,observacion,estado) values (" + getCodigoD() + "," + getCodigoG1() + ","
                    + getCodigoG2() + "," + getCapital() + "," + getInteres() + "," + getPlazo() + ",'" + getFecha() + "','" + getFecha_fin() + "','"
                    + getObservacion() + "','" + getEstado() + "');";
        } else if (getCodigoG1() != 0) {
            //En caso de que le gaantae 2 no exita se proceder a guardar unicamnente el garante 1.

            sql = "Insert into credito (cod_socio,garante_1,capital,tasa_interes,plazo_meses,"
                    + "fecha_credito,fecha_finalizacion,observacion,estado) values (" + getCodigoD() + "," + getCodigoG1()
                    + "," + getCapital() + "," + getInteres() + "," + getPlazo() + ",'" + getFecha() + "','" + getFecha_fin() + "','"
                    + getObservacion() + "','" + getEstado() + "');";
        } else if (getCodigoG2() != 0) {
            //En caso que el garante uno exista
            sql = "Insert into credito (cod_socio,garante_2,capital,tasa_interes,plazo_meses,"
                    + "fecha_credito,fecha_finalizacion,observacion,estado) values (" + getCodigoD() + "," + getCodigoG2()
                    + "," + getCapital() + "," + getInteres() + "," + getPlazo() + ",'" + getFecha() + "','" + getFecha_fin() + "','"
                    + getObservacion() + "','" + getEstado() + "');";
        } else {
            //En caso de que no exista nigun garante
            sql = "Insert into credito (cod_socio,capital,tasa_interes,plazo_meses,"
                    + "fecha_credito,fecha_finalizacion,observacion,estado) values (" + getCodigoD() + "," + getCapital() + "," + getInteres() + "," + getPlazo() + ",'" + getFecha() + "','" + getFecha_fin() + "','"
                    + getObservacion() + "','" + getEstado() + "');";
        }

        return con.accion(sql);
    }

    public int codigoCredito() {

        try {
            int cod = 0;
            String sql = "Select max(cod_credito) as codigo from credito";
            ResultSet rs = con.consulta(sql);
            while (rs.next()) {
                cod = rs.getInt("codigo");
            }
            return cod;

        } catch (SQLException ex) {
            Logger.getLogger(ModeloCredito.class
                    .getName()).log(Level.SEVERE, null, ex);
            return 0;
        }

    }

    public List<Credito> cargarLista(String aguja) {
        System.out.println(aguja + " agujaaaaaaaaaaaaaaaaaaaaaaaa");
        String sql = "select cod_credito,s1.nombre_socio||' '||s1.apellido_socio as deudor,"
                + "garante_1,"
                + "garante_2,"
                + "capital,tasa_interes,plazo_meses,fecha_credito,fecha_finalizacion,observacion,estado "
                + "from socio s1 join credito c1 on c1.cod_socio=s1.codigo_socio "
                + "where UPPER(s1.nombre_socio||' '||s1.apellido_socio)like  UPPER('%" + aguja + "%'); ";

        List<Credito> lista = new ArrayList<Credito>();
        ResultSet rs = con.consulta(sql);

        try {
            String garante_1;
            String garante_2;
            while (rs.next()) {
                System.out.println("ingreseeeeeeeeeeeeeeeeeeeeeeeeee");
                Credito c = new Credito();
                c.setCodigo(rs.getInt("cod_credito"));
                c.setDeudor(rs.getString("deudor"));

                if (rs.getString("garante_1") == null) {
                    garante_1 = "Sin garante";
                } else {
                    garante_1 = socio.nombre(rs.getString("garante_1"));
                }

                c.setGarante1(garante_1);

                if (rs.getString("garante_2") == null) {
                    garante_2 = "Sin garante";
                } else {
                    garante_2 = socio.nombre(rs.getString("garante_2"));
                }

                c.setGarante2(garante_2);
                c.setCapital(rs.getDouble("capital"));
                c.setInteres(rs.getFloat("tasa_interes"));
                c.setPlazo(rs.getInt("plazo_meses"));
                c.setFecha(rs.getString("fecha_credito"));
                c.setFecha_fin(rs.getString("fecha_finalizacion"));
                c.setObservacion(rs.getString("observacion"));
                c.setEstado(rs.getString("estado"));
                lista.add(c);
            }
            rs.close();
            /*
            String sql1 = "select cod_credito,s1.nombre_socio||' '||s1.apellido_socio as deudor,"
                    + "s2.nombre_socio||' '|| s2.apellido_socio as garante_1,"
                    + "s3.nombre_socio||' '||s3.apellido_socio as garante_2,"
                    + "capital,tasa_interes,plazo_meses,fecha_credito,fecha_finalizacion,observacion,estado "
                    + "from socio s1 join credito c1 on c1.cod_socio=s1.codigo_socio "
                    + "join socio s2 on c1.garante_1=s2.codigo_socio "
                    + "join socio s3 on c1.garante_2=s3.codigo_socio "
                    + "where garante_2 is null "
                    + "and UPPER(s1.nombre_socio||' '||s1.apellido_socio) like  UPPER('%" + aguja + "%')";
            ResultSet rs1 = con.consulta(sql1);

            while (rs1.next()) {
                System.out.println("ingreseeeeeeeeeeeeeeeeeeeeeeeeee");
                Credito c = new Credito();
                c.setCodigo(rs.getInt("cod_credito"));
                c.setDeudor(rs.getString("deudor"));

                if (rs.getString("garante_1") == null) {
                    garante_1 = "Sin garante";
                } else {
                    garante_1 = socio.nombre(rs.getString("garante_1"));
                }

                c.setGarante1(garante_1);

                if (rs.getString("garante_2") == null) {
                    garante_2 = "Sin garante";
                } else {
                    garante_2 = socio.nombre(rs.getString("garante_2"));
                }

                c.setGarante2(garante_2);
                c.setCapital(rs.getDouble("capital"));
                c.setInteres(rs.getFloat("tasa_interes"));
                c.setPlazo(rs.getInt("plazo_meses"));
                c.setFecha(rs.getString("fecha_credito"));
                c.setFecha_fin(rs.getString("fecha_finalizacion"));
                c.setObservacion(rs.getString("observacion"));
                c.setEstado(rs.getString("estado"));
                lista.add(c);
            }*/
            rs.close();
            return lista;

        } catch (SQLException ex) {

            Logger.getLogger(ModeloCredito.class
                    .getName()).log(Level.SEVERE, null, ex);
            return lista;
        }

    }

    public List<Credito> filtrarCredito(String aguja) {
        String garante_1;
        String garante_2;

        List<Credito> lista = new ArrayList<Credito>();
        String sql1;
        if (!aguja.equals("")) {
            sql1 = "select cod_credito,s1.nombre_socio||' '||s1.apellido_socio as deudor,"
                    + "garante_1,"
                    + "garante_2,"
                    + " capital,tasa_interes,plazo_meses,fecha_credito,fecha_finalizacion,observacion,estado "
                    + "from socio s1 join credito c1 on c1.cod_socio=s1.codigo_socio "
                    + " where estado= '" + aguja + "'";

        } else {
            sql1 = "select cod_credito,s1.nombre_socio||' '||s1.apellido_socio as deudor,"
                    + "garante_1,"
                    + "garante_2,"
                    + " capital,tasa_interes,plazo_meses,fecha_credito,fecha_finalizacion,observacion,estado "
                    + "from socio s1 join credito c1 on c1.cod_socio=s1.codigo_socio ";

        }
        ResultSet rs = con.consulta(sql1);
        try {
            while (rs.next()) {
                Credito c = new Credito();
                c.setCodigo(rs.getInt("cod_credito"));
                c.setDeudor(rs.getString("deudor"));

                if (rs.getString("garante_1") == null) {
                    garante_1 = "Sin garante";
                } else {
                    garante_1 = socio.nombre(rs.getString("garante_1"));
                }
                c.setGarante1(garante_1);
                if (rs.getString("garante_2") == null) {
                    garante_2 = "Sin garante";
                } else {
                    garante_2 = socio.nombre(rs.getString("garante_2"));
                }

                c.setGarante2(garante_2);
                c.setCapital(rs.getDouble("capital"));
                c.setInteres(rs.getFloat("tasa_interes"));
                c.setPlazo(rs.getInt("plazo_meses"));
                c.setFecha(rs.getString("fecha_credito"));
                c.setFecha_fin(rs.getString("fecha_finalizacion"));
                c.setObservacion(rs.getString("observacion"));
                c.setEstado(rs.getString("estado"));
                lista.add(c);
            }

            rs.close();
            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(ModeloCredito.class
                    .getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public int comprobarGarante(int cod_garante) {
        String sql = "SELECT cod_garante from garante where cod_socio =" + cod_garante + " "
                + " AND estado_garante=true";
        try {
            int fila = 0;
            ResultSet rs = con.consulta(sql);
            while (rs.next()) {
                fila++;
            }
            return fila;

        } catch (SQLException ex) {
            Logger.getLogger(ModeloCredito.class
                    .getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public int comprobarSolicitante() {
        String sql = "SELECT * from credito where estado= 'Vigente' and cod_socio= " + getCodigoD();
        ResultSet rs = con.consulta(sql);
        int fila = 0;
        try {
            while (rs.next()) {
                fila++;
            }
            rs.close();
            return fila;

        } catch (SQLException ex) {
            Logger.getLogger(ModeloCredito.class
                    .getName()).log(Level.SEVERE, null, ex);
            return fila;
        }

    }

    public List<Credito> listarCredito(int codigo) {

        String sql = "SELECT cod_socio,garante_1,garante_2,capital,tasa_interes,plazo_meses,observacion "
                + "from credito where cod_credito=" + codigo;

        List<Credito> lista = new ArrayList<Credito>();
        ResultSet rs = con.consulta(sql);

        try {

            while (rs.next()) {
                Credito c = new Credito();
                c.setDeudor(rs.getString("cod_socio"));
                c.setGarante1(rs.getString("garante_1"));
                c.setGarante2(rs.getString("garante_2"));
                c.setCapital(rs.getDouble("capital"));
                c.setInteres(rs.getFloat("tasa_interes"));
                c.setPlazo(rs.getInt("plazo_meses"));
                c.setObservacion(rs.getString("observacion"));
                lista.add(c);
            }
            rs.close();
            return lista;

        } catch (SQLException ex) {

            Logger.getLogger(ModeloCredito.class
                    .getName()).log(Level.SEVERE, null, ex);
            return lista;
        }

    }

    public String DatosSocio() {

        String sql = "Select nombre_socio||' '||apellido_socio as deudor from  socio "
                + "where codigo_socio=" + getCodigoD() + ";";

        String lista = null;
        ResultSet rs = con.consulta(sql);
        try {
            while (rs.next()) {
                Credito c = new Credito();
                c.setDeudor(rs.getString("deudor"));
                lista = rs.getString("deudor");
            }
            rs.close();
            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(ModeloCredito.class
                    .getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public String cedulas(int cod) {
        String sql = "Select cedula_socio from socio where codigo_socio=" + cod;
        ResultSet rs = con.consulta(sql);
        String cedula = null;
        try {
            while (rs.next()) {
                Credito c = new Credito();
                cedula = rs.getString("cedula_socio");
            }
            rs.close();
            return cedula;

        } catch (SQLException ex) {
            Logger.getLogger(ModeloCredito.class
                    .getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
    
    
  

    //Sirve para verificar que un credito ya haya sido pagado almenos una letra
    public int consultarPago(int codigoCredito) {
        String sql = "select * from amortizacion where estado= 'Pagado' and cod_credito= " + codigoCredito;

        try {
            int cod = 0;

            ResultSet rs = con.consulta(sql);
            while (rs.next()) {
                cod = rs.getInt("codigo");
            }
            return cod;

        } catch (SQLException ex) {
            Logger.getLogger(ModeloCredito.class
                    .getName()).log(Level.SEVERE, null, ex);
            return 0;
        }

    }

    // Metodo que permite modificar borrar la amortizacion generada 
    //y despues modifica el credito creando una nueva amortizacion.(la amortizacion se crea gracias aun trigger dentro de la base de datos).
    public boolean modificarCredito(int codigoCredito,int codigoD,int g1, int g2, double capital, double tInteres,int plazo,String fecha,String fechaFin,String observacion) {
        String sql = "delete from amortizacion where  cod_credito=" + codigoCredito;
        if (con.accion(sql)) {
            eliminarGarante(codigoCredito);
            String sql1 = "UPDATE credito set cod_socio= "+codigoD+",garante_1= " +g1 + ", garante_2= " + g2
                    + ",capital =  " + capital + ",tasa_interes= " + tInteres+ ", plazo_meses= " + plazo + ",fecha_credito= '" + fecha + "' ,fecha_finalizacion= ' " +fechaFin
                    + "' ,Observacion= '" + observacion + "', estado= 'Vigente' where cod_credito= "+codigoCredito;
            System.out.println("garntea 1 "+ g1);
            System.out.println(g2+" garante 2         codifgo deudor "+codigoD );
            System.out.println(codigoCredito+" codigo credito");
            return con.accion(sql1);
        } else {
            return false;
        }

    }
    

    public void eliminarGarante(int codigoCredito){
        String sql="Delete from garante where cod_credito= "+codigoCredito;
 
        System.out.println("metodo para eliminar");
        con.accion(sql);
    }
    
    public boolean eliminarCredito(String codigo) {
        String sql = "delete from garante where cod_credito='" + codigo + "'";    
        if (con.accion(sql) == true) {
             String sq2 = "delete from amortizacion where cod_credito='" + codigo + "'";
             if (con.accion(sq2) == true) {
                 String sq3 = "delete from credito where cod_credito='" + codigo + "'";
                 if (con.accion(sq3) == true) {                     
                 }  
            }
           return true;  
        } else {
            System.out.println("Error eliminar");
            return false;
        }
    }
}
