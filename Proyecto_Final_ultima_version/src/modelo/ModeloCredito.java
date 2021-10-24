package modelo;

import java.util.Date;

public class ModeloCredito extends Credito {

    ConexionPG con = new ConexionPG();

    public ModeloCredito(String deudor, String cedulaD, int codigoD, int codigoG1, int codigoG2, String cedulaG1, String cedulaG2, String Garante1, String Garante2, int codigo, double capital, float interes, int plazo, Date fecha, String observacion, String estado) {
        super(deudor, cedulaD, codigoD, codigoG1, codigoG2, cedulaG1, cedulaG2, Garante1, Garante2, codigo, capital, interes, plazo, fecha, observacion, estado);
    }

    public ModeloCredito() {
    }


    public boolean grabarCredito() {

        String sql = "Insert into credito (cod_socio,garante_1,garante_2,capital,tasa_interes,plazo_meses,"
                + "fecha_credito,fecha_finalizacion,observacion,estado)";

        return con.accion(sql);
    }

}
