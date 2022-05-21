
package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Vista_credito extends javax.swing.JInternalFrame {

    public Vista_credito() {
        initComponents();
    }

    public JTextField getCedula_D() {
        return cedula_D;
    }

    public void setCedula_D(JTextField cedula_D) {
        this.cedula_D = cedula_D;
    }

    public JDialog getjDialog1() {
        return jDialog1;
    }

    public void setjDialog1(JDialog jDialog1) {
        this.jDialog1 = jDialog1;
    }

    public JTextArea getTxt_garantes() {
        return txt_garantes;
    }

    public void setTxt_garantes(JTextArea txt_garantes) {
        this.txt_garantes = txt_garantes;
    }

    public JTextArea getTxt_solicitante() {
        return txt_solicitante;
    }

    public void setTxt_solicitante(JTextArea txt_solicitante) {
        this.txt_solicitante = txt_solicitante;
    }

    public JTextField getTxt_G2() {
        return txt_G2;
    }

    public void setTxt_G2(JTextField txt_G2) {
        this.txt_G2 = txt_G2;
    }

    public JTextField getTxt_capital() {
        return txt_capital;
    }

    public void setTxt_capital(JTextField txt_capital) {
        this.txt_capital = txt_capital;
    }

    public JTextField getTxt_cedulaG1() {
        return txt_cedulaG1;
    }

    public void setTxt_cedulaG1(JTextField txt_cedulaG1) {
        this.txt_cedulaG1 = txt_cedulaG1;
    }

    public JTextArea getTxt_observacion() {
        return txt_observacion;
    }

    public void setTxt_observacion(JTextArea txt_observacion) {
        this.txt_observacion = txt_observacion;
    }

    public JTextField getTxt_plazo() {
        return txt_plazo;
    }

    public void setTxt_plazo(JTextField txt_plazo) {
        this.txt_plazo = txt_plazo;
    }

    public JTextField getTxt_tasa() {
        return txt_tasa;
    }

    public void setTxt_tasa(JTextField txt_tasa) {
        this.txt_tasa = txt_tasa;
    }

    public JButton getBtn_aprobar() {
        return btn_aprobar;
    }

    public void setBtn_aprobar(JButton btn_aprobar) {
        this.btn_aprobar = btn_aprobar;
    }

    public JButton getBtn_cancelar() {
        return btn_cancelar;
    }

    public void setBtn_cancelar(JButton btn_cancelar) {
        this.btn_cancelar = btn_cancelar;
    }

    public JButton getBtn_eliminar() {
        return btn_eliminar;
    }

    public void setBtn_eliminar(JButton btn_eliminar) {
        this.btn_eliminar = btn_eliminar;
    }

    public JButton getBtn_imprmir() {
        return btn_imprmir;
    }

    public void setBtn_imprmir(JButton btn_imprmir) {
        this.btn_imprmir = btn_imprmir;
    }

    public JButton getBtn_modificar() {
        return btn_modificar;
    }

    public void setBtn_modificar(JButton btn_modificar) {
        this.btn_modificar = btn_modificar;
    }

    public JButton getBtn_registrar() {
        return btn_registrar;
    }

    public void setBtn_registrar(JButton btn_registrar) {
        this.btn_registrar = btn_registrar;
    }

    public JButton getBtn_verirficar() {
        return btn_verirficar;
    }

    public void setBtn_verirficar(JButton btn_verirficar) {
        this.btn_verirficar = btn_verirficar;
    }

    public JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    public void setjTabbedPane1(JTabbedPane jTabbedPane1) {
        this.jTabbedPane1 = jTabbedPane1;
    }

    public JLabel getLbl_titulo() {
        return lbl_titulo;
    }

    public void setLbl_titulo(JLabel lbl_titulo) {
        this.lbl_titulo = lbl_titulo;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JTextField getTxt_buscar() {
        return txt_buscar;
    }

    public void setTxt_buscar(JTextField txt_buscar) {
        this.txt_buscar = txt_buscar;
    }

    public JComboBox<String> getCombo_filtrar() {
        return combo_filtrar;
    }

    public void setCombo_filtrar(JComboBox<String> combo_filtrar) {
        this.combo_filtrar = combo_filtrar;
    }

    public JLabel getLbl_numeroCredito() {
        return lbl_numeroCredito;
    }

    public void setLbl_numeroCredito(JLabel lbl_numeroCredito) {
        this.lbl_numeroCredito = lbl_numeroCredito;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        cedula_D = new javax.swing.JTextField();
        txt_cedulaG1 = new javax.swing.JTextField();
        txt_G2 = new javax.swing.JTextField();
        txt_capital = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_tasa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_plazo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_aprobar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        lbl_titulo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_garantes = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_solicitante = new javax.swing.JTextArea();
        btn_verirficar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_observacion = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        lbl_numeroCredito = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_imprmir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txt_buscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        combo_filtrar = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jDialog1.getContentPane().add(cedula_D, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 77, 169, -1));
        jDialog1.getContentPane().add(txt_cedulaG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 169, -1));

        txt_G2.setToolTipText("Campo Opcional");
        jDialog1.getContentPane().add(txt_G2, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 149, 169, -1));

        txt_capital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_capitalActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(txt_capital, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 183, 169, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cedula Solicitante:");
        jDialog1.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 81, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cedula Garante 1:");
        jDialog1.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 106, -1, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cedula Garante 2:");
        jDialog1.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 151, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Capital:");
        jDialog1.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tasa Interes");
        jDialog1.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));
        jDialog1.getContentPane().add(txt_tasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 219, 169, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Plazo:");
        jDialog1.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));
        jDialog1.getContentPane().add(txt_plazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 261, 169, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Observacion:");
        jDialog1.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        btn_aprobar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/acepta.png"))); // NOI18N
        btn_aprobar.setText("Aprobar");
        btn_aprobar.setToolTipText("Para Aprobar el Credito");
        btn_aprobar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        jDialog1.getContentPane().add(btn_aprobar, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 312, 140, 32));

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/cancela.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        jDialog1.getContentPane().add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 312, 107, 32));
        jDialog1.getContentPane().add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 28, 304, 23));

        txt_garantes.setColumns(20);
        txt_garantes.setRows(5);
        txt_garantes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        jScrollPane4.setViewportView(txt_garantes);

        jTabbedPane1.addTab("Garantes", jScrollPane4);

        txt_solicitante.setColumns(20);
        txt_solicitante.setRows(5);
        txt_solicitante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        jScrollPane3.setViewportView(txt_solicitante);

        jTabbedPane1.addTab("Solicitante", jScrollPane3);

        jDialog1.getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 77, 399, 185));

        btn_verirficar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/consultar.png"))); // NOI18N
        btn_verirficar.setText("Verificar");
        btn_verirficar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        jDialog1.getContentPane().add(btn_verirficar, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 312, 99, 32));

        txt_observacion.setColumns(20);
        txt_observacion.setRows(5);
        jScrollPane2.setViewportView(txt_observacion);

        jDialog1.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 303, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("N. Credito");
        jDialog1.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 41, -1, -1));

        lbl_numeroCredito.setBackground(new java.awt.Color(255, 255, 255));
        lbl_numeroCredito.setForeground(new java.awt.Color(255, 255, 255));
        jDialog1.getContentPane().add(lbl_numeroCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 41, 56, 26));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_imagenes/fondo_azul_oscuro.jpeg"))); // NOI18N
        jDialog1.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 410));

        setClosable(true);
        setMaximizable(true);
        setTitle("Credito");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/agregar-rol.png"))); // NOI18N
        btn_registrar.setText("Agregar");
        btn_registrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 26, -1, -1));

        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/editar.png"))); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        getContentPane().add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 26, -1, -1));

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/eliminar.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 26, -1, -1));

        btn_imprmir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/imprime.png"))); // NOI18N
        btn_imprmir.setText("Imprimir");
        btn_imprmir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        getContentPane().add(btn_imprmir, new org.netbeans.lib.awtextra.AbsoluteConstraints(824, 26, -1, -1));

        tabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N°", "Deudor", "Garante 1", "Garante 2", "Capital", "Interes", "Plazo", "Fecha Solicitud", "Fecha Fin", "Observacion", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 78, 961, 274));
        getContentPane().add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 31, 175, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/consultar.png"))); // NOI18N
        jLabel1.setText("Buscar:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 27, -1, -1));

        combo_filtrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Filtrar>", "Vigentes", "Pagados", "Todos" }));
        combo_filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_filtrarActionPerformed(evt);
            }
        });
        getContentPane().add(combo_filtrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 30, 131, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_imagenes/fondo_azul_oscuro.jpeg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_capitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_capitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_capitalActionPerformed

    private void combo_filtrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_filtrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_filtrarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aprobar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_imprmir;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_verirficar;
    private javax.swing.JTextField cedula_D;
    private javax.swing.JComboBox<String> combo_filtrar;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_numeroCredito;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_G2;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_capital;
    private javax.swing.JTextField txt_cedulaG1;
    private javax.swing.JTextArea txt_garantes;
    private javax.swing.JTextArea txt_observacion;
    private javax.swing.JTextField txt_plazo;
    private javax.swing.JTextArea txt_solicitante;
    private javax.swing.JTextField txt_tasa;
    // End of variables declaration//GEN-END:variables
}
