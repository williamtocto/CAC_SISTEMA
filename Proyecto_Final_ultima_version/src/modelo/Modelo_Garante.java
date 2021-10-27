package modelo;

public class Modelo_Garante extends Garante {
    ConexionPG pg=new ConexionPG();
    public Modelo_Garante(int cod, int cod_socio, int cod_credito, boolean estado) {
        super(cod, cod_socio, cod_credito, estado);
    }

    public Modelo_Garante() {
    }

    public boolean grabarGarante() {
        String sql = "Insert into garante(cod_socio,cod_credito,estado_garante) values (" + getCod_socio() + ","
                + getCod_credito() + ",'" + isEstado() + "');";       
        return pg.accion(sql);
    }

}
