package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloCredito extends Credito {

    ConexionPG con = new ConexionPG();

    public ModeloCredito(String deudor, String cedulaD, int codigoD, int codigoG1, int codigoG2, String cedulaG1, String cedulaG2, String Garante1, String Garante2, int codigo, double capital, float interes, int plazo, String fecha, String observacion, String estado, String fecha_fin) {
        super(deudor, cedulaD, codigoD, codigoG1, codigoG2, cedulaG1, cedulaG2, Garante1, Garante2, codigo, capital, interes, plazo, fecha, observacion, estado, fecha_fin);
    }

    public ModeloCredito() {
    }

    public boolean grabarCredito() {
        String sql = "";
        if (getCodigoG2() != 0) {
            sql = "Insert into credito (cod_socio,garante_1,garante_2,capital,tasa_interes,plazo_meses,"
                    + "fecha_credito,fecha_finalizacion,observacion,estado) values (" + getCodigoD() + "," + getCodigoG1() + ","
                    + getCodigoG2() + "," + getCapital() + "," + getInteres() + "," + getPlazo() + ",'" + getFecha() + "','" + getFecha_fin() + "','"
                    + getObservacion() + "','" + getEstado() + "');";
        } else {
            sql = "Insert into credito (cod_socio,garante_1,capital,tasa_interes,plazo_meses,"
                    + "fecha_credito,fecha_finalizacion,observacion,estado) values (" + getCodigoD() + "," + getCodigoG1()
                    + "," + getCapital() + "," + getInteres() + "," + getPlazo() + ",'" + getFecha() + "','" + getFecha_fin() + "','"
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
            Logger.getLogger(ModeloCredito.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }

    }

    public List<Credito> cargarLista(String aguja) {
        String sql = "select cod_credito,s1.nombre_socio||' '||s1.apellido_socio as deudor,"
                + "s2.nombre_socio||' '|| s2.apellido_socio as garante_1,"
                + "s3.nombre_socio||' '||s3.apellido_socio as garante_2,"
                + "capital,tasa_interes,plazo_meses,fecha_credito,fecha_finalizacion,observacion,estado "
                + "from socio s1 join credito c1 on c1.cod_socio=s1.codigo_socio "
                + "join socio s2 on c1.garante_1=s2.codigo_socio "
                + "join socio s3 on c1.garante_2=s3.codigo_socio "
                + "where UPPER(s1.nombre_socio||' '||s1.apellido_socio)like  UPPER('%" + aguja + "%') OR "
                + "UPPER(s2.nombre_socio||' '|| s2.apellido_socio) like UPPER('%" + aguja + "%') OR "
                + "UPPER(s3.nombre_socio||' '|| s3.apellido_socio) like UPPER('%" + aguja + "%');";

        List<Credito> lista = new ArrayList<Credito>();
        ResultSet rs = con.consulta(sql);

        try {

            while (rs.next()) {
                Credito c = new Credito();
                c.setCodigo(rs.getInt("cod_credito"));
                c.setDeudor(rs.getString("deudor"));
                c.setGarante1(rs.getString("garante_1"));
                c.setGarante2(rs.getString("garante_2"));
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
            String sql1 = "select cod_credito,s1.nombre_socio||' '||s1.apellido_socio as deudor,"
                    + "s2.nombre_socio||' '|| s2.apellido_socio as garante_1,"
                    + " capital,tasa_interes,plazo_meses,fecha_credito,fecha_finalizacion,observacion,estado "
                    + "from socio s1 join credito c1 on c1.cod_socio=s1.codigo_socio "
                    + "join socio s2 on c1.garante_1=s2.codigo_socio where garante_2 is null "
                    + "and UPPER(s1.nombre_socio||' '||s1.apellido_socio) like  UPPER('%" + aguja + "%')";
            ResultSet rs1 = con.consulta(sql1);

            while (rs1.next()) {
                Credito c = new Credito();
                c.setCodigo(rs1.getInt("cod_credito"));
                c.setDeudor(rs1.getString("deudor"));
                c.setGarante1(rs1.getString("garante_1"));
                c.setCapital(rs1.getDouble("capital"));
                c.setInteres(rs1.getFloat("tasa_interes"));
                c.setPlazo(rs1.getInt("plazo_meses"));
                c.setFecha(rs1.getString("fecha_credito"));
                c.setFecha_fin(rs1.getString("fecha_finalizacion"));
                c.setObservacion(rs1.getString("observacion"));
                c.setEstado(rs1.getString("estado"));
                lista.add(c);
            }
            rs1.close();

            return lista;

        } catch (SQLException ex) {

            Logger.getLogger(ModeloCredito.class.getName()).log(Level.SEVERE, null, ex);
            return lista;
        }

    }

    public int comprobarGarante() {
        String sql = "SELECT * from garante where cod_socio in(" + getCodigoG1() + "," + getCedulaG2() + ") "
                + "AND estado_garante=true";
        try {
            int fila = 0;
            ResultSet rs = con.consulta(sql);
            while (rs.next()) {
               fila++;
            }
            return fila;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCredito.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        
    }

    public int comprobarSolicitante() {
        String sql = "SELECT cod_credito from credito where estado= 'Vigente'";
        ResultSet rs = con.consulta(sql);
        int fila = 0;
        try {
            while (rs.next()) {
                fila++;
            }
            rs.close();
            return fila;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCredito.class.getName()).log(Level.SEVERE, null, ex);
            return fila;
        }

    }

    public List<Credito> DatosSocio() {

        String sql = "Select nombre_socio||' '||apellido_socio as deudor from  socio s join credito c on s.codigo_socio=c.cod_socio where cod_socio=" + getCodigoD()
                + " and estado='Vigente'";
        List<Credito> lista = new ArrayList<Credito>();

        ResultSet rs = con.consulta(sql);
        try {
            while (rs.next()) {
                Credito c = new Credito();
                c.setDeudor(rs.getString("deudor"));
                lista.add(c);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {

            Logger.getLogger(ModeloCredito.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

}
