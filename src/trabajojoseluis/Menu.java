/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabajojoseluis;

/**
 *
 * @author code
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Menu principal");
        this.setSize(960, 540);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ventas = new javax.swing.JButton();
        coches = new javax.swing.JButton();
        reparaciones = new javax.swing.JButton();
        usuarios = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Gill Sans MT", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(200, 200, 200));
        jLabel8.setText("Reparaciones");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, -1, -1));

        jLabel9.setFont(new java.awt.Font("Gill Sans MT", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(200, 200, 200));
        jLabel9.setText("Gestion de usuarios");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Gill Sans MT", 0, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(200, 200, 200));
        jLabel10.setText("Ventas");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, -1));

        jLabel11.setFont(new java.awt.Font("Gill Sans MT", 0, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(200, 200, 200));
        jLabel11.setText("Coches");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(200, 200, 200));
        jLabel6.setText("Menú principal");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        ventas.setBackground(new java.awt.Color(0, 0, 0));
        ventas.setForeground(new java.awt.Color(0, 0, 0));
        ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIX/ventas.png"))); // NOI18N
        ventas.setBorder(null);
        ventas.setBorderPainted(false);
        ventas.setContentAreaFilled(false);
        ventas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        coches.setBackground(new java.awt.Color(0, 0, 0));
        coches.setForeground(new java.awt.Color(0, 0, 0));
        coches.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIX/coche.png"))); // NOI18N
        coches.setBorder(null);
        coches.setBorderPainted(false);
        coches.setContentAreaFilled(false);
        coches.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(coches, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, -1, -1));

        reparaciones.setBackground(new java.awt.Color(0, 0, 0));
        reparaciones.setForeground(new java.awt.Color(0, 0, 0));
        reparaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIX/reparar.png"))); // NOI18N
        reparaciones.setBorder(null);
        reparaciones.setBorderPainted(false);
        reparaciones.setContentAreaFilled(false);
        reparaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(reparaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, -1, -1));

        usuarios.setBackground(new java.awt.Color(0, 0, 0));
        usuarios.setForeground(new java.awt.Color(0, 0, 0));
        usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIX/usuario.png"))); // NOI18N
        usuarios.setBorder(null);
        usuarios.setBorderPainted(false);
        usuarios.setContentAreaFilled(false);
        usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosActionPerformed(evt);
            }
        });
        getContentPane().add(usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIX/fondonegro.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosActionPerformed
        dispose();
        Usuarios usuarios = new Usuarios();
        usuarios.setVisible(true);
    }//GEN-LAST:event_usuariosActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton coches;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton reparaciones;
    private javax.swing.JButton usuarios;
    private javax.swing.JButton ventas;
    // End of variables declaration//GEN-END:variables
}
