
package modelo;

public class Garante {

    private int cod;
    private int cod_socio;
    private int cod_credito;
    private boolean estado;

    public Garante(int cod, int cod_socio, int cod_credito, boolean estado) {
        this.cod = cod;
        this.cod_socio = cod_socio;
        this.cod_credito = cod_credito;
        this.estado = estado;
    }

    public Garante() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCod_socio() {
        return cod_socio;
    }

    public void setCod_socio(int cod_socio) {
        this.cod_socio = cod_socio;
    }

    public int getCod_credito() {
        return cod_credito;
    }

    public void setCod_credito(int cod_credito) {
        this.cod_credito = cod_credito;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
