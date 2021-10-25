package modelo;

public class Modelo_Garante extends Garante {

    public Modelo_Garante(int cod, int cod_socio, int cod_credito, boolean estado) {
        super(cod, cod_socio, cod_credito, estado);
    }

    public Modelo_Garante() {
    }

    public void grabarGarante() {

        String sql = "Insert into garante(cod_socio,cod_credito,estado_garante) values (" + getCod_socio() + ","
                + getCod_credito() + ",'" + isEstado() + "';";

    }

}
