package modelo;

import java.util.Date;

public class Credito {

    private String deudor;
    private String cedulaD;
    private String cedulaG1;
    private String cedulaG2;
    private String Garante1;
    private String Garante2;
    private int codigo;
    private double capital;
    private float interes;
    private int plazo;
    private Date fecha;
    private String observacion;
    private String estado;

    public Credito(String deudor, String cedulaD, String cedulaG1, String cedulaG2, String Garante1, String Garante2, int codigo, double capital, float interes, int plazo, Date fecha, String observacion, String estado) {
        this.deudor = deudor;
        this.cedulaD = cedulaD;
        this.cedulaG1 = cedulaG1;
        this.cedulaG2 = cedulaG2;
        this.Garante1 = Garante1;
        this.Garante2 = Garante2;
        this.codigo = codigo;
        this.capital = capital;
        this.interes = interes;
        this.plazo = plazo;
        this.fecha = fecha;
        this.observacion = observacion;
        this.estado = estado;
    }

    public Credito() {
    }
    

    public String getDeudor() {
        return deudor;
    }

    public void setDeudor(String deudor) {
        this.deudor = deudor;
    }

    public String getCedulaD() {
        return cedulaD;
    }

    public void setCedulaD(String cedulaD) {
        this.cedulaD = cedulaD;
    }

    public String getCedulaG1() {
        return cedulaG1;
    }

    public void setCedulaG1(String cedulaG1) {
        this.cedulaG1 = cedulaG1;
    }

    public String getCedulaG2() {
        return cedulaG2;
    }

    public void setCedulaG2(String cedulaG2) {
        this.cedulaG2 = cedulaG2;
    }

    public String getGarante1() {
        return Garante1;
    }

    public void setGarante1(String Garante1) {
        this.Garante1 = Garante1;
    }

    public String getGarante2() {
        return Garante2;
    }

    public void setGarante2(String Garante2) {
        this.Garante2 = Garante2;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    

}
