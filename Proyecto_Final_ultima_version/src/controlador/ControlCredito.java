package controlador;

import java.util.Calendar;
import java.util.Date;
import modelo.ModeloCredito;
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
        String estado = "Pendiente";

        modelo.setCodigoD(codigo_socio);
        modelo.setCodigoG1(garante_1);
        modelo.setCodigoG2(garante_2);

    }

}
