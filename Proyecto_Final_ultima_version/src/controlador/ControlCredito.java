package controlador;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Credito;
import modelo.ModeloCredito;
import modelo.Modelo_Garante;
import modelo.Modelo_Socio;
import vista.Vista_credito;

public class ControlCredito {

    private ModeloCredito modelo;
    private Vista_credito vista;
    int fila = -1;
    int n;

    public ControlCredito(ModeloCredito modelo, Vista_credito vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setTitle("Creditos");
        vista.setVisible(true);
    }

    public void IniciarControl() {
        vista.getBtn_aprobar().addActionListener(l -> {
            try {
                DefinirMetodo(n);
            } catch (SQLException ex) {
                Logger.getLogger(ControlCredito.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        vista.getBtn_registrar().addActionListener(l -> {
            try {
                cargarDialogo(1);
            } catch (SQLException ex) {
                Logger.getLogger(ControlCredito.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        vista.getBtn_modificar().addActionListener(l -> {
            try {
                cargarDialogo(2);
            } catch (SQLException ex) {
                Logger.getLogger(ControlCredito.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

    }

    public void DefinirMetodo(int n) throws SQLException {

        if (n == 1) {
            fila = vista.getTabla().getSelectedRow();
            grabarCredito();
        } else if (n == 2) {
            fila = vista.getTabla().getSelectedRow();
            modificar();
        }
    }

    public void modificar() {

    }

    private void cargarDialogo(int origen) throws SQLException {

        vista.getjDialog1().setSize(950, 400);
        vista.getjDialog1().setLocationRelativeTo(vista);
        fila = vista.getTabla().getSelectedRow();
        if (origen == 1) {
            vista.getjDialog1().setTitle("Registrar Credito");
            n = 1;
            vista.getjDialog1().setVisible(true);
        } else {
            if (fila == -1) {
                JOptionPane.showMessageDialog(vista, "SELECCIONE UN DATO DE LA TABLA", "WILLIAM TOCTO", 2);
            } else {
                // cargarDatos();
                vista.getjDialog1().setTitle("Editar Credito");
                n = 2;
                vista.getjDialog1().setVisible(true);
            }

        }

    }

    public void cargarlista() {
        List<Credito> lista = new ArrayList<Credito>();
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) vista.getTabla().getModel();
        tblModel.setNumRows(0);
        lista.stream().forEach(l -> {
            String[] credito ={
                String.valueOf(l.getCodigo()),l.getDeudor(),l.getGarante1(),l.getGarante2(),String.valueOf(l.getCapital()
                ),String.valueOf(l.getInteres()),String.valueOf(l.getPlazo()),String.valueOf(l.getFecha())
                ,l.getObservacion(),l.getEstado()
            };
            tblModel.addRow(credito);
        });

    }

    public void grabarCredito() {

        Modelo_Socio so = new Modelo_Socio();
        int codigo_socio = so.codigoSocio(vista.getCedula_D().getText());
        int garante_1 = so.codigoSocio(vista.getTxt_cedulaG1().getText());
        int garante_2 = so.codigoSocio(vista.getTxt_G2().getText());
        System.out.println(codigo_socio + " " + garante_1 + " " + garante_2);

        double capital = Double.parseDouble(vista.getTxt_capital().getText());
        float tasa_interes = Float.parseFloat(vista.getTxt_tasa().getText());
        int plazo_meses = Integer.parseInt(vista.getTxt_plazo().getText());
        Date fecha_credito;
        Calendar c = Calendar.getInstance();
        fecha_credito = c.getTime();
        c.add(Calendar.MONTH, +plazo_meses);
        Date fecha_fin = c.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formato = sdf.format(fecha_credito);
        String formato1 = sdf.format(fecha_fin);
        String Observacion = vista.getTxt_observacion().getText();
        String estado = "Vigente";
        modelo.setCodigoD(codigo_socio);
        modelo.setCodigoG1(garante_1);
        modelo.setCodigoG2(garante_2);
        modelo.setPlazo(plazo_meses);
        modelo.setInteres(tasa_interes);
        modelo.setCapital(capital);
        modelo.setFecha(formato);
        modelo.setFecha_fin(formato1);
        modelo.setObservacion(Observacion);
        modelo.setEstado(estado);

        if (modelo.grabarCredito()) {
            JOptionPane.showMessageDialog(null, "Credito guardado con exito", "CAC", 1);
            System.out.println("holaaaaaa");
            Modelo_Garante mo = new Modelo_Garante();
            int cod_credito = modelo.codigoCredito();
            mo.setCod_credito(cod_credito);
            mo.setEstado(true);

            if (garante_1 != 0) {
                System.out.println("1111");
                mo.setCod_socio(garante_1);
                mo.grabarGarante();
            }
            if (garante_2 != 0) {
                System.out.println("3");
                mo.setCod_socio(garante_2);
                mo.grabarGarante();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Error al grabar", "CAC", 0);
        }
    }

}
