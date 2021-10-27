package modelo;

import java.util.Date;
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
        System.out.println("hola aqui estoy");
        System.out.println(getInteres());
        String sql = "Insert into credito (cod_socio,garante_1,garante_2,capital,tasa_interes,plazo_meses,"
                + "fecha_credito,fecha_finalizacion,observacion,estado) values (" + getCodigoD() + "," + getCodigoG1() + ","
                + getCodigoG2() + "," + getCapital() + "," + getInteres() + "," + getPlazo() + ",'" + getFecha() + "','" + getFecha_fin() + "','"
                + getObservacion() + "','" + getEstado() + "');";
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

    public List<Credito> cargarLista( String aguja) {
        String sql = "select  s1.nombre_socio||' '||s1.apellido_socio as deudor,"
                + "s2.nombre_socio||' '|| s2.apellido_socio as garante_1,"
                + "s3.nombre_socio||' '||s3.apellido_socio as garante_2,"
                + "capital,tasa_interes,plazo_meses,fecha_credito,fecha_finalizacion,observacion,estado "
                + "from socio s1 join credito c1 on c1.cod_socio=s1.codigo_socio "
                + "join socio s2 on c1.garante_1=s2.codigo_socio "
                + "join socio s3 on c1.garante_2=s3.codigo_socio "
                + " where UPPER(s1.nombre_socio||' '||s1.apellido_socio)like  UPPER('%"+aguja+"%');";
        List<Credito> lista = new ArrayList<Credito>();
        ResultSet rs = con.consulta(sql);

        try {
            
            while (rs.next()) {
                Credito c = new Credito();
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
            return lista;
        } catch (SQLException ex) {

            Logger.getLogger(ModeloCredito.class.getName()).log(Level.SEVERE, null, ex);
            return lista;
        }

    }

}
