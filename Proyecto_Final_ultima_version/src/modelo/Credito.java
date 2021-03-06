package modelo;

import java.util.Date;

public class Credito {

    private String deudor;
    private String cedulaD;
    private int codigoD;
    private int codigoG1;
    private int codigoG2;
    private String cedulaG1;
    private String cedulaG2;
    private String Garante1;
    private String Garante2;
    private int codigo;
    private double capital;
    private float interes;
    private int plazo;
    private String fecha;
    private String observacion;
    private String estado;
    private String fecha_fin;
   
    public Credito() {
    }

    public Credito(String deudor, String cedulaD, int codigoD, int codigoG1, int codigoG2, String cedulaG1, String cedulaG2, String Garante1, String Garante2, int codigo, double capital, float interes, int plazo, String fecha, String observacion, String estado, String fecha_fin) {
        this.deudor = deudor;
        this.cedulaD = cedulaD;
        this.codigoD = codigoD;
        this.codigoG1 = codigoG1;
        this.codigoG2 = codigoG2;
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
        this.fecha_fin = fecha_fin;
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

    public int getCodigoD() {
        return codigoD;
    }

    public void setCodigoD(int codigoD) {
        this.codigoD = codigoD;
    }

    public int getCodigoG1() {
        return codigoG1;
    }

    public void setCodigoG1(int codigoG1) {
        this.codigoG1 = codigoG1;
    }

    public int getCodigoG2() {
        return codigoG2;
    }

    public void setCodigoG2(int codigoG2) {
        this.codigoG2 = codigoG2;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }


    
   
}
