package modelo;

import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloCredito extends Credito {

    ConexionPG con = new ConexionPG();

    public ModeloCredito(String deudor, String cedulaD, int codigoD, int codigoG1, int codigoG2, String cedulaG1, String cedulaG2, String Garante1, String Garante2, int codigo, double capital, float interes, int plazo, Date fecha, String observacion, String estado, Date fecha_fin) {
        super(deudor, cedulaD, codigoD, codigoG1, codigoG2, cedulaG1, cedulaG2, Garante1, Garante2, codigo, capital, interes, plazo, fecha, observacion, estado, fecha_fin);
    }

    public ModeloCredito() {
    }

    public boolean grabarCredito() {

        String sql = "Insert into credito (cod_socio,garante_1,garante_2,capital,tasa_interes,plazo_meses,"
                + "fecha_credito,fecha_finalizacion,observacion,estado) values (" + getCodigoD() + "," + getCodigoG1() + ","
                + getCodigoG2() + "," + getCapital() + "," + getInteres() + "," + getPlazo() + ",'" + getFecha() + "'," + getFecha_fin() + "','"
                + getObservacion() + "','" + getEstado() + "');";
        return con.accion(sql);
    }

    public int codigoCredito() {

        try {
            int cod = 0;
            String sql = "Select max(cod_credito) from credito";
            ResultSet rs = con.consulta(sql);
            while (rs.next()) {
                cod= rs.getInt("cod_credito");
            }
           return cod;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCredito.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }

    }

}
