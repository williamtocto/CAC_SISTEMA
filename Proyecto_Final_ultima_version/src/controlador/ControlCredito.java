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

import modelo.Modelo_Socio;
import vista.Vista_credito;

public class ControlCredito {

    private ModeloCredito modelo;
    private Vista_credito vista;
    int fila = -1;
    int n;

    public ControlCredito(ModeloCredito modelo, Vista_credito vista) {
        System.out.println("Te amoooo");
        this.modelo = modelo;
        this.vista = vista;
        vista.setTitle("Creditos");
        vista.setVisible(true);
        cargarlista("");
        desactivarBotones();
    }

    public void desactivarBotones() {
        vista.getBtn_aprobar().setEnabled(false);
        vista.getBtn_modificar().setEnabled(false);
    }

    public void IniciarControl() {

        vista.getTabla().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });

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
                desactivarBotones();
            } catch (SQLException ex) {
                Logger.getLogger(ControlCredito.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        vista.getBtn_modificar().addActionListener(l -> {
            try {
                cargarDatos();
                cargarDialogo(2);
            } catch (SQLException ex) {
                Logger.getLogger(ControlCredito.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        vista.getCombo_filtrar().addActionListener(l -> filtrar());

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
        int op = 0;

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
            double capital = Double.parseDouble(vista.getTxt_capital().getText());
            int plazo = Integer.parseInt(vista.getTxt_plazo().getText());
            if (capital < 500 && plazo > 12) {
                vista.getTxt_plazo().setText("");
                JOptionPane.showMessageDialog(null, "El plazo para este capital es demasiado extenso", "CAC", 0);
            } else if (capital > 2000) {
                vista.getTxt_plazo().setText("");
                JOptionPane.showMessageDialog(null, "El monto solicitado sobrepasa el limite", "CAC", 0);
            } else {
                Modelo_Socio so = new Modelo_Socio();
                int codigo_socio = so.codigoSocio(vista.getCedula_D().getText());

                modelo.setCodigoD(codigo_socio);
                int cred = modelo.comprobarSolicitante();
                String lista;
                if (cred != 0) {
                    lista = modelo.DatosSocio();

                    vista.getTxt_solicitante().setText("\nEl Socio " + lista + " actualmente cuenta con credito Vigente");
                    vista.getBtn_aprobar().setEnabled(true);

                } else {
                    lista = modelo.DatosSocio();

                    if (lista == null) {
                        JOptionPane.showMessageDialog(null, "Cedula solicitante incorrecta", "", 0);
                        op = 1;
                    } else {
                        vista.getTxt_solicitante().setText("\nEl Socio " + lista + " puede adquirir su Credito");
                        vista.getBtn_aprobar().setEnabled(true);
                    }

                }

                if (op == 0) {
                    codigo_socio = so.codigoSocio(vista.getTxt_cedulaG1().getText());
                    String mensaje = null;

                    if (codigo_socio != 0) {
                        mensaje = comprobarGarante(codigo_socio);
                        System.out.println(mensaje + " mensajeeeee1");
                    } else {
                        JOptionPane.showMessageDialog(null, "Cedula garante 1 incorrecta", "", 0);

                    }

                    codigo_socio = so.codigoSocio(vista.getTxt_G2().getText());
                    if (!vista.getTxt_G2().getText().equals("")) {
                        if (codigo_socio != 0) {
                            mensaje = mensaje + " " + comprobarGarante(codigo_socio);
                        } else {

                            JOptionPane.showMessageDialog(null, "Cedula garante 2 incorrecta", "", 0);
                        }
                        vista.getTxt_garantes().setText(mensaje);
                        vista.getBtn_aprobar().setEnabled(true);
                    }
                }

            }
        }

    }

    public String comprobarGarante(int codigo) {

        int garante = modelo.comprobarGarante(codigo);

        String lista = null;
        String mensaje;
        if (garante != 0) {
            modelo.setCodigoD(codigo);
            lista = modelo.DatosSocio();
            mensaje = "\nEl Socio " + lista + " es garante de " + garante + " Creditos";
            return mensaje;
        } else {
            modelo.setCodigoD(codigo);
            lista = modelo.DatosSocio();
            mensaje = "\nEl Socio " + lista + " es garante de " + garante + " Creditos";
            return mensaje;
        }

    }

    public void modificar() {

    }

    public void filtrar() {
        desactivarBotones();
        int indice = vista.getCombo_filtrar().getSelectedIndex();
        String estado = "";
        switch (indice) {

            case 1 -> {
                estado = "Vigente";
                filtracion(estado);
                break;
            }
            case 2 -> {
                estado = "Pagado";
                filtracion(estado);
                break;
            }
            case 3 -> {
                estado = "";
                filtracion(estado);
                break;
            }
            default -> {
            }
        }

    }

    private void cargarDialogo(int origen) throws SQLException {

        vista.getjDialog1().setSize(950, 450);
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
                vista.getBtn_aprobar().setText("Guardar");
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

    // Metdo para listar mediante el combo box ya sean los creditosd pagados o vigentes
    public void filtracion(String estado) {
        List<Credito> lista = new ArrayList<Credito>();
        lista = modelo.filtrarCredito(estado);
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

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {
        vista.getBtn_modificar().setEnabled(true);
    }

    public void cargarDatos() {

        int fila1 = vista.getTabla().getSelectedRow();
        int codigo = Integer.parseInt(vista.getTabla().getValueAt(fila1, 0).toString());
        List<Credito> lista = modelo.listarCredito(codigo);

        String cedula = null;

        for (int i = 0; i < lista.size(); i++) {
            vista.getCedula_D().setText(modelo.cedulas(Integer.parseInt(lista.get(i).getDeudor())));

            cedula = lista.get(i).getGarante1();
            if (cedula != null) {
                vista.getTxt_cedulaG1().setText(modelo.cedulas(Integer.parseInt(lista.get(i).getGarante1())));
            } else {
                vista.getTxt_cedulaG1().setText("");
            }

            vista.getTxt_cedulaG1().setText(modelo.cedulas(Integer.parseInt(lista.get(i).getGarante1())));
            cedula = lista.get(i).getGarante2();

            if (cedula != null) {
                vista.getTxt_G2().setText(modelo.cedulas(Integer.parseInt(lista.get(i).getGarante2())));
            } else {
                vista.getTxt_G2().setText("");
            }

            vista.getTxt_capital().setText(String.valueOf(lista.get(i).getCapital()));
            vista.getTxt_tasa().setText(String.valueOf(lista.get(i).getInteres()));
            vista.getTxt_plazo().setText(String.valueOf(lista.get(i).getPlazo()));
            vista.getTxt_observacion().setText(lista.get(i).getObservacion());
        }

    }
    
    
    public void editarCredito(){
          int fila1 = vista.getTabla().getSelectedRow();
        int codigo = Integer.parseInt(vista.getTabla().getValueAt(fila1, 0).toString());
        
        //Primero se verificara que no se hayan realizado ningun pago para modificar este Credito.
        int validarPago;
        
        validarPago=modelo.consultarPago(codigo);
        if (validarPago!=0) {
            //Aqui se cancela la modificacion ya que el socio pagó una cuota de su credito
                   
        }else{
            // Aqui se procede a modificar ya que este socio no pago niguna cuota
            
        }
    }

}
