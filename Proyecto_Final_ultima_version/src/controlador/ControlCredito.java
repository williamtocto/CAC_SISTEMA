
package controlador;

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
        Modelo_Socio so=new Modelo_Socio();
        
        int codigo_socio=so.codigoSocio(vista.getTxt_solicitante().getText());
        int garante_1;
        int garante_2;
        double capital;
        float tasa_interes;
        int plazo_meses;
        Date fecha_credito;
        Date fecha_fin;
        String Observacion;
        String estado;
        
        
        
   
    }
    
    
    
    

    
}
