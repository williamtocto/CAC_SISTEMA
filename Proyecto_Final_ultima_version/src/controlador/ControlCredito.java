package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
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
        cargarlista("");
        vista.getBtn_aprobar().setEnabled(false);
        System.out.println("HOlA MYRIAN BIENVENIDA, LE QUIERO");
    }

    public void IniciarControl() {

        KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                cargarlista(vista.getTxt_buscar().getText());
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        };
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

        vista.getTxt_buscar().addKeyListener(kl);
        vista.getBtn_verirficar().addActionListener(l -> comprobarSolicitud());

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

    public void comprobarSolicitud() {
        if (vista.getCedula_D().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingresar la cedula del solicitante", "CAC", 0);
        } else if (vista.getTxt_cedulaG1().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingresar la cedula del garante 1", "CAC", 0);
        } else if (vista.getTxt_capital().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingresar el capital", "CAC", 0);
        } else if (vista.getTxt_tasa().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingresar la tasa de interes", "CAC", 0);
        } else if (vista.getTxt_plazo().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingresar el plazo", "CAC", 0);
        } else if (vista.getTxt_observacion().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingresar la observacion", "CAC", 0);
        } else {
            Modelo_Socio so = new Modelo_Socio();
            int codigo_socio = so.codigoSocio(vista.getCedula_D().getText());
            modelo.setCodigoD(codigo_socio);
            int cred = modelo.codigoCredito();
            List<Credito> lista = new ArrayList<Credito>();
            if (cred != 0) {
                lista = modelo.DatosSocio();
                lista.stream().forEach(l -> {
                    vista.getTxt_solicitante().setText("\nEl Socio " + l.getDeudor() + " actualmente cuenta con credito Vigente");
                });
                vista.getBtn_aprobar().setEnabled(true);

            } else {
                lista = modelo.DatosSocio();
                lista.stream().forEach(l -> {
                    vista.getTxt_solicitante().setText("\nEl Socio " + l.getDeudor() + " puede adquirir su Credito");
                });
                vista.getBtn_aprobar().setEnabled(true);
            }
            codigo_socio = so.codigoSocio(vista.getTxt_cedulaG1().getText());
            System.out.println(codigo_socio+"  ssaaaa");
            modelo.setCodigoD(codigo_socio);
            modelo.setCodigoG1(codigo_socio);
            comprobarGarante();
            codigo_socio = so.codigoSocio(vista.getTxt_G2().getText());
            if (codigo_socio != 0) {
                modelo.setCodigoD(codigo_socio);
                modelo.setCodigoG2(codigo_socio);
                comprobarGarante();
            }

        }

    }

    public void comprobarGarante() {

        int garante = modelo.comprobarGarante();
        List<Credito> lista = new ArrayList<Credito>();
        if (garante != 0) {
            lista = modelo.DatosSocio();
            lista.stream().forEach(l -> {
                vista.getTxt_garantes().setText("\nEl Socio " + l.getDeudor() + " es garante de " + garante + " Creditos");
            });
        } else {
            lista = modelo.DatosSocio();
            lista.stream().forEach(l -> {
                vista.getTxt_garantes().setText("\nEl Socio " + l.getDeudor() + " Actualmente no es garante de nigun Credito");

            });
        }
        comprobarGarante();

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

    public void cargarlista(String aguja) {
        List<Credito> lista = new ArrayList<Credito>();
        lista = modelo.cargarLista(aguja);
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) vista.getTabla().getModel();
        tblModel.setNumRows(0);
        Collections.sort(lista, (x, y) -> x.getFecha().compareToIgnoreCase(y.getFecha()));
        Collections.reverse(lista);
        lista.stream().forEach(l -> {
            String[] credito = {
                String.valueOf(l.getCodigo()), l.getDeudor(), l.getGarante1(), l.getGarante2(), String.valueOf(l.getCapital()
                ), String.valueOf(l.getInteres()), String.valueOf(l.getPlazo()), String.valueOf(l.getFecha()), String.valueOf(l.getFecha_fin()),
                l.getObservacion(), l.getEstado()
            };
            tblModel.addRow(credito);
        });

    }

    public void grabarCredito() {
        int op = JOptionPane.showOptionDialog(null, "Esta Seguro en Aprobar Este Credito", "",
                JOptionPane.YES_NO_CANCEL_OPTION, 2, null, new Object[]{"SI", "NO",}, null);

        if (op == 0) {
            Modelo_Socio so = new Modelo_Socio();
            int codigo_socio = so.codigoSocio(vista.getCedula_D().getText());
            int garante_1 = so.codigoSocio(vista.getTxt_cedulaG1().getText());
            int garante_2 = so.codigoSocio(vista.getTxt_G2().getText());
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
            } else {
                JOptionPane.showMessageDialog(null, "Error al grabar", "CAC", 0);
            }
        }

    }

}
