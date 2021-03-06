
package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;


public class Vista_Usuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_Usuario
     */
    public Vista_Usuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogo_usuario = new javax.swing.JDialog();
        LblCodigo_rol = new javax.swing.JLabel();
        LblNombre_usuario = new javax.swing.JLabel();
        LblContraseña = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        txt_usuario = new javax.swing.JTextField();
        lbl_titulo = new javax.swing.JLabel();
        combo_box = new javax.swing.JComboBox<>();
        lbl_contrasenia_nueva = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        lbl_cedula = new javax.swing.JLabel();
        lbl_cedula1 = new javax.swing.JLabel();
        lbl_cedula2 = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();
        btn_aceptar = new javax.swing.JButton();
        txt_confirmeClave = new javax.swing.JPasswordField();
        txt_contraseniaNueva = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_usuario = new javax.swing.JTable();
        txt_buscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        dialogo_usuario.setTitle("Usuarios");
        dialogo_usuario.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblCodigo_rol.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LblCodigo_rol.setForeground(new java.awt.Color(255, 255, 255));
        LblCodigo_rol.setText("Tipo de Rol:");
        dialogo_usuario.getContentPane().add(LblCodigo_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 136, -1));

        LblNombre_usuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LblNombre_usuario.setForeground(new java.awt.Color(255, 255, 255));
        LblNombre_usuario.setText("Nombre del Usuario:");
        dialogo_usuario.getContentPane().add(LblNombre_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 200, 20));

        LblContraseña.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        LblContraseña.setText(" Confirmar contraseña:");
        dialogo_usuario.getContentPane().add(LblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        txt_cedula.setBackground(new java.awt.Color(240, 240, 240));
        txt_cedula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dialogo_usuario.getContentPane().add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 82, 220, 20));

        txt_usuario.setBackground(new java.awt.Color(240, 240, 240));
        txt_usuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dialogo_usuario.getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 220, 20));

        lbl_titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo.setText("Usuarios");
        dialogo_usuario.getContentPane().add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 260, 40));

        combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dialogo_usuario.getContentPane().add(combo_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 220, -1));

        lbl_contrasenia_nueva.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_contrasenia_nueva.setForeground(new java.awt.Color(255, 255, 255));
        lbl_contrasenia_nueva.setText("Contraseña:");
        dialogo_usuario.getContentPane().add(lbl_contrasenia_nueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 180, -1));

        txt_nombre.setEditable(false);
        txt_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        dialogo_usuario.getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 220, 20));

        txt_apellido.setEditable(false);
        txt_apellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dialogo_usuario.getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 220, 20));

        lbl_cedula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cedula.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cedula.setText("Cédula:");
        dialogo_usuario.getContentPane().add(lbl_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 110, -1));

        lbl_cedula1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cedula1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cedula1.setText("Nombre:");
        dialogo_usuario.getContentPane().add(lbl_cedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 102, -1));

        lbl_cedula2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cedula2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cedula2.setText("Apellido:");
        dialogo_usuario.getContentPane().add(lbl_cedula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 71, 20));

        btn_cancelar.setBackground(new java.awt.Color(204, 204, 204));
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/cancela.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        dialogo_usuario.getContentPane().add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 120, 30));

        btn_aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/acepta.png"))); // NOI18N
        btn_aceptar.setText("Acpetar");
        btn_aceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        dialogo_usuario.getContentPane().add(btn_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 103, 30));

        txt_confirmeClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_confirmeClaveActionPerformed(evt);
            }
        });
        dialogo_usuario.getContentPane().add(txt_confirmeClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 220, -1));
        dialogo_usuario.getContentPane().add(txt_contraseniaNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 220, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_imagenes/fondo_azul_oscuro.jpeg"))); // NOI18N
        jLabel4.setText("jLabel4");
        dialogo_usuario.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 470));

        setClosable(true);
        setTitle("Usuarios");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/añadir_usuario.png"))); // NOI18N
        btn_agregar.setText("Agregar ");
        btn_agregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 120, 40));

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/eliminar.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 100, 40));

        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/editar.png"))); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 100, 40));

        tabla_usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        tabla_usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "     Número", "      Cédula", "     Tipo de Rol", "     Nombre", "     Usuario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_usuario.setGridColor(new java.awt.Color(255, 153, 51));
        tabla_usuario.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tabla_usuario.setSelectionForeground(new java.awt.Color(0, 0, 51));
        jScrollPane1.setViewportView(tabla_usuario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 500, 253));

        txt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 150, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/consultar.png"))); // NOI18N
        jLabel1.setText("Buscar:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 21, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_imagenes/fondo_azul_oscuro.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 630, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void txt_confirmeClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_confirmeClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_confirmeClaveActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    public JLabel getLblCodigo_rol() {
        return LblCodigo_rol;
    }

    public void setLblCodigo_rol(JLabel LblCodigo_rol) {
        this.LblCodigo_rol = LblCodigo_rol;
    }

    public JLabel getLblContraseña() {
        return LblContraseña;
    }

    public void setLblContraseña(JLabel LblContraseña) {
        this.LblContraseña = LblContraseña;
    }

    public JButton getBtn_modificar() {
        return btn_modificar;
    }

    public JLabel getLbl_contrasenia_nueva() {
        return lbl_contrasenia_nueva;
    }

    public void setLbl_contrasenia_nueva(JLabel lbl_contrasenia_nueva) {
        this.lbl_contrasenia_nueva = lbl_contrasenia_nueva;
    }

    public void setBtn_modificar(JButton btm_modificar) {
        this.btn_modificar = btm_modificar;
    }

    public JButton getBtn_agregar() {
        return btn_agregar;
    }

    public void setBtn_agregar(JButton btn_agregar) {
        this.btn_agregar = btn_agregar;
    }

    public JTextField getTxt_buscar() {
        return txt_buscar;
    }

    public void setTxt_buscar(JTextField txt_buscar) {
        this.txt_buscar = txt_buscar;
    }

 

    public JButton getBtn_eliminar() {
        return btn_eliminar;
    }

    public void setBtn_eliminar(JButton btn_eliminar) {
        this.btn_eliminar = btn_eliminar;
    }

    public JComboBox<String> getCombo_box() {
        return combo_box;
    }

    public void setCombo_box(JComboBox<String> combo_box) {
        this.combo_box = combo_box;
    }

    public JLabel getLbl_titulo() {
        return lbl_titulo;
    }

    public void setLbl_titulo(JLabel lbl_titulo) {
        this.lbl_titulo = lbl_titulo;
    }

    public JTable getTabla_usuario() {
        return tabla_usuario;
    }

    public void setTabla_usuario(JTable tabla_usuario) {
        this.tabla_usuario = tabla_usuario;
    }

    public JTextField getTxt_apellido() {
        return txt_apellido;
    }

    public void setTxt_apellido(JTextField txt_apellido) {
        this.txt_apellido = txt_apellido;
    }

    public JTextField getTxt_cedula() {
        return txt_cedula;
    }

    public void setTxt_cedula(JTextField txt_cedula) {
        this.txt_cedula = txt_cedula;
    }

    public JPasswordField getTxt_confirmeClave() {
        return txt_confirmeClave;
    }

    public void setTxt_confirmeClave(JPasswordField txt_confirmeClave) {
        this.txt_confirmeClave = txt_confirmeClave;
    }

    public JPasswordField getTxt_contraseniaNueva() {
        return txt_contraseniaNueva;
    }

    public void setTxt_contraseniaNueva(JPasswordField txt_contraseniaNueva) {
        this.txt_contraseniaNueva = txt_contraseniaNueva;
    }

 

    public JTextField getTxt_nombre() {
        return txt_nombre;
    }

    public void setTxt_nombre(JTextField txt_nombre) {
        this.txt_nombre = txt_nombre;
    }

    public JTextField getTxt_usuario() {
        return txt_usuario;
    }

    public void setTxt_usuario(JTextField txt_usuario) {
        this.txt_usuario = txt_usuario;
    }

    public JDialog getDialogo_usuario() {
        return dialogo_usuario;
    }

    public void setDialogo_usuario(JDialog dialogo_usuario) {
        this.dialogo_usuario = dialogo_usuario;
    }

    public JButton getBtn_aceptar() {
        return btn_aceptar;
    }

    public void setBtn_aceptar(JButton btn_aceptar) {
        this.btn_aceptar = btn_aceptar;
    }

    public JButton getBtn_cancelar() {
        return btn_cancelar;
    }

    public void setBtn_cancelar(JButton btn_cancelar) {
        this.btn_cancelar = btn_cancelar;
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblCodigo_rol;
    private javax.swing.JLabel LblContraseña;
    private javax.swing.JLabel LblNombre_usuario;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JComboBox<String> combo_box;
    private javax.swing.JDialog dialogo_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_cedula1;
    private javax.swing.JLabel lbl_cedula2;
    private javax.swing.JLabel lbl_contrasenia_nueva;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTable tabla_usuario;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JPasswordField txt_confirmeClave;
    private javax.swing.JPasswordField txt_contraseniaNueva;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
