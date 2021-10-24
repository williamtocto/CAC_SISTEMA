
package vista;

import javax.swing.JButton;
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
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_solicitante = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_garantes = new javax.swing.JTextArea();
        btn_verirficar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_observacion = new javax.swing.JTextArea();
        btn_registrar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_imprmir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txt_buscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        txt_G2.setToolTipText("Campo Opcional");

        txt_capital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_capitalActionPerformed(evt);
            }
        });

        jLabel2.setText("Cedula Solicitante:");

        jLabel3.setText("Cedula Garante 1:");

        jLabel4.setText("Cedula Garante 2:");

        jLabel5.setText("Capital:");

        jLabel6.setText("Tasa Interes");

        jLabel7.setText("Plazo:");

        jLabel9.setText("Observacion:");

        btn_aprobar.setText("Aprobar");
        btn_aprobar.setToolTipText("Para Aprobar el Credito");

        btn_cancelar.setText("Cancelar");

        txt_solicitante.setColumns(20);
        txt_solicitante.setRows(5);
        jScrollPane3.setViewportView(txt_solicitante);

        jTabbedPane1.addTab("Solicitante", jScrollPane3);

        txt_garantes.setColumns(20);
        txt_garantes.setRows(5);
        jScrollPane4.setViewportView(txt_garantes);

        jTabbedPane1.addTab("Garantes", jScrollPane4);

        btn_verirficar.setText("Verificar");

        txt_observacion.setColumns(20);
        txt_observacion.setRows(5);
        jScrollPane2.setViewportView(txt_observacion);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(47, 47, 47))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9))
                            .addGap(44, 44, 44)))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(47, 47, 47)))
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_capital, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(txt_tasa, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_plazo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_G2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_cedulaG1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cedula_D, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btn_verirficar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(btn_aprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cedula_D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txt_cedulaG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_G2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(10, 10, 10)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_capital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_tasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_plazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel9))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_verirficar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_aprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        btn_registrar.setText("Agregar");

        btn_modificar.setText("Modificar");

        btn_eliminar.setText("Eliminar");

        btn_imprmir.setText("Imprimir");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N°", "Deudor", "Garante 1", "Garante 2", "Capital", "Interes", "Plazo", "Fecha", "Observacion", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jLabel1.setText("Buscar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 397, Short.MAX_VALUE)
                .addComponent(btn_registrar)
                .addGap(18, 18, 18)
                .addComponent(btn_modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_eliminar)
                .addGap(18, 18, 18)
                .addComponent(btn_imprmir)
                .addGap(251, 251, 251))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_modificar)
                    .addComponent(btn_registrar)
                    .addComponent(btn_imprmir)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_capitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_capitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_capitalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aprobar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_imprmir;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_verirficar;
    private javax.swing.JTextField cedula_D;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
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
