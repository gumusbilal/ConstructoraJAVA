package Presentacion;

import DAO.DaoCliente;
import DAO.hash;
import LogicaNegocio.TransaccionesCliente;
import javax.swing.JOptionPane;

/**
 * Nombre del formulario: frmCliente
 * Fecha: 29-08-2019
 * Version: 1.0
 * CopyRight: Itca-Fepade
 * @author Alexis Aguilar
 */
public class frmCliente extends javax.swing.JFrame {
    
    TransaccionesCliente ob = new TransaccionesCliente();

    /** Creates new form frmCliente */
    public frmCliente() {
        initComponents();
        this.setLocationRelativeTo(this);
    }
    
    public void limpiar(){
        this.txtUsuario.setText("");
        this.txtCorreo.setText("");
        this.txtNombre.setText("");
        this.txtTelefono.setText("");
        this.txtDui.setText("");
        this.txtFechaNacimiento.setText("");
        this.txtDireccion.setText("");
        this.txtContraseña.setText("");
        this.txtConfirmarContraseña.setText("");
    }
    
     public void encriptar() {
        //String invitado = "Cliente";

        String pass = new String(txtContraseña.getPassword());
        String passCon = new String(txtConfirmarContraseña.getPassword());

        if (txtUsuario.getText().equals("") || txtCorreo.getText().equals("") || 
                txtNombre.getText().equals("") || txtTelefono.getText().equals("") || 
                txtDui.getText().equals("") || txtFechaNacimiento.getText().equals("") || 
                txtDireccion.getText().equals("") || pass.equals("") || passCon.equals("")) {

            JOptionPane.showMessageDialog(null, "Hay campos vacios.!");

        } else {
            if (pass.equals(passCon)) {

                DaoCliente ob2 = new DaoCliente();
                if (ob2.existeUsuario(this.txtUsuario.getText()) == 0) {

                    String nuevoPass = hash.sha1(pass);

                    ob.agregar(txtUsuario.getText(), txtCorreo.getText(), nuevoPass,
                        txtNombre.getText(), txtDireccion.getText(), txtTelefono.getText(),
                        txtDui.getText(), txtFechaNacimiento.getText());

                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "El suario ya existe.!!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        txtDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDui = new javax.swing.JFormattedTextField();
        txtTelefono = new javax.swing.JFormattedTextField();
        txtFechaNacimiento = new javax.swing.JFormattedTextField();
        txtConfirmarContraseña = new javax.swing.JPasswordField();
        txtContraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(700, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 600));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrarse.png"))); // NOI18N
        btnRegistrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrarse2.png"))); // NOI18N
        btnRegistrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrarse2.png"))); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 310, 40));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 490, 30));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(21, 40, 147));
        jLabel7.setText("Correo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(21, 40, 147));
        jLabel9.setText("Direccion:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(21, 40, 147));
        jLabel10.setText("Dui:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(21, 40, 147));
        jLabel6.setText("Fecha nac:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(21, 40, 147));
        jLabel5.setText("Telefono:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(21, 40, 147));
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(21, 40, 147));
        jLabel3.setText("Contraseña:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 160, 30));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(21, 40, 147));
        jLabel2.setText("Usuario:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 40, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 40, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minimizar.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 40, 50));

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(21, 40, 147));
        jLabel14.setText("Registro de Clientes");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 19)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(21, 40, 147));
        jLabel15.setText("<html> Confirmar Contraseña: </html>");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 110, 60));
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 160, 30));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 160, 30));

        try {
            txtDui.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtDui, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 160, 30));

        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 160, 30));

        try {
            txtFechaNacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 160, 30));

        txtConfirmarContraseña.setText("jPasswordField1");
        txtConfirmarContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtConfirmarContraseñaMouseClicked(evt);
            }
        });
        jPanel1.add(txtConfirmarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 160, 30));

        txtContraseña.setText("jPasswordField1");
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContraseñaMouseClicked(evt);
            }
        });
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 160, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        encriptar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
       Login log = new Login();
       log.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        int dialogo = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null, "Desea cerrar la aplicación?", "Cerrar Aplicacion",2 ,dialogo);

        if(resultado == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
       this.setState(frmCliente.ICONIFIED); //Para minimizar la aplicacion
    }//GEN-LAST:event_jLabel13MouseClicked

     int xx, xy;
    
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void txtConfirmarContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConfirmarContraseñaMouseClicked
        this.txtConfirmarContraseña.setText("");
    }//GEN-LAST:event_txtConfirmarContraseñaMouseClicked

    private void txtContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMouseClicked
        this.txtContraseña.setText("");
    }//GEN-LAST:event_txtContraseñaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtConfirmarContraseña;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JFormattedTextField txtDui;
    private javax.swing.JFormattedTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
