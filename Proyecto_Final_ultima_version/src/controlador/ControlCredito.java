package controlador;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.ModeloCredito;
import modelo.Modelo_Garante;
import modelo.Modelo_Socio;
import vista.Vista_credito;

public class ControlCredito {

    private ModeloCredito modelo;
    private Vista_credito vista;

    public ControlCredito(ModeloCredito modelo, Vista_credito vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setTitle("Creditos");
        vista.setVisible(true);
    }
    public void IniciarControl() {
        
     
        
    }
    
    

    public void grabarCredito() {
        
        
        Modelo_Socio so = new Modelo_Socio();
        int codigo_socio = so.codigoSocio(vista.getTxt_solicitante().getText());
        int garante_1 = so.codigoSocio(vista.getTxt_solicitante().getText());
        int garante_2 = so.codigoSocio(vista.getTxt_solicitante().getText());
        double capital = Double.parseDouble(vista.getTxt_capital().getText());
        float tasa_interes = Float.parseFloat(vista.getTxt_tasa().getText());
        int plazo_meses = Integer.parseInt(vista.getTxt_tasa().getText());
        Date fecha_credito;
        Calendar c = Calendar.getInstance();
        fecha_credito = c.getTime();
        c.add(Calendar.MONTH, +plazo_meses);
        Date fecha_fin = c.getTime();
        String Observacion = vista.getTxt_observacion().getText();
        String estado = "Vigente";
        modelo.setCodigoD(codigo_socio);
        modelo.setCodigoG1(garante_1);
        modelo.setCodigoG2(garante_2);
        modelo.setPlazo(plazo_meses);
        modelo.setCapital(capital);
        modelo.setFecha(fecha_credito);
        modelo.setFecha_fin(fecha_fin);
        modelo.setObservacion(Observacion);
        modelo.setEstado(estado);

        if (modelo.grabarCredito()) {
            JOptionPane.showMessageDialog(null, "Credito guardado con exito", "CAC", 1);

            Modelo_Garante mo = new Modelo_Garante();
            int cod_credito = modelo.codigoCredito();
            mo.setCod_credito(cod_credito);
            mo.setEstado(true);
            if (garante_1 != 0) {
                mo.setCod_socio(garante_1);
                mo.grabarGarante();
            }
            if (garante_2 != 0) {
                mo.setCod_socio(garante_2);
                mo.grabarGarante();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Error al grabar", "CAC", 0);
        }
    }

}
