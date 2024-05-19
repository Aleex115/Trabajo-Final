/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabajojoseluis;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import misclases.Conex;

/**
 *
 * @author code
 */
public class Coches extends javax.swing.JFrame {

    DefaultComboBoxModel<String> model1 = new DefaultComboBoxModel<>();

    /**
     * Creates new form Coches
     */
    String email,modeloC,n_bastidorC;
    long precioC;

    public Coches(String emailS) {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Gestion de coches");
        this.setSize(1000, 740);
        precio.setVisible(false);
        preciotxt.setVisible(false);
        btnComprar.setVisible(false);
        modelo.setVisible(false);
        marca.setVisible(false);
        estado.setVisible(false);
        categoria.setVisible(false);
        km.setVisible(false);
        cv.setVisible(false);
        jLabel1.setVisible(false);

        modelCoches.setModel(model1);
        rbDisp.setSelected(true);
        email = emailS;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        modelCoches = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        rbTodos = new javax.swing.JRadioButton();
        rbDisp = new javax.swing.JRadioButton();
        rpVendidos = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        modelo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        marca = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        categoria = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        cv = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        km = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        preciotxt = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        precio = new javax.swing.JLabel();
        btnComprar1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/coches/e55.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 590, 380));

        modelCoches.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        modelCoches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelCochesActionPerformed(evt);
            }
        });
        getContentPane().add(modelCoches, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Gestión de coches");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        buttonGroup1.add(rbTodos);
        rbTodos.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        rbTodos.setForeground(new java.awt.Color(200, 173, 127));
        rbTodos.setText("Todos");
        rbTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTodosActionPerformed(evt);
            }
        });
        getContentPane().add(rbTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        buttonGroup1.add(rbDisp);
        rbDisp.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        rbDisp.setForeground(new java.awt.Color(200, 173, 127));
        rbDisp.setText("Disponibles");
        rbDisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDispActionPerformed(evt);
            }
        });
        getContentPane().add(rbDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));

        buttonGroup1.add(rpVendidos);
        rpVendidos.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        rpVendidos.setForeground(new java.awt.Color(200, 173, 127));
        rpVendidos.setText("Vendidos");
        rpVendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rpVendidosActionPerformed(evt);
            }
        });
        getContentPane().add(rpVendidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(200, 173, 127));
        jLabel3.setText("Coche:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 3, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(179, 147, 96));
        jLabel4.setText("Modelo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        modelo.setFont(new java.awt.Font("Gill Sans MT", 0, 22)); // NOI18N
        modelo.setForeground(new java.awt.Color(200, 173, 127));
        modelo.setText("jLabel5");
        getContentPane().add(modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 3, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(179, 147, 96));
        jLabel6.setText("Marca:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        marca.setFont(new java.awt.Font("Gill Sans MT", 0, 22)); // NOI18N
        marca.setForeground(new java.awt.Color(200, 173, 127));
        marca.setText("jLabel7");
        getContentPane().add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Gill Sans MT", 3, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(179, 147, 96));
        jLabel8.setText("Categoria:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        categoria.setFont(new java.awt.Font("Gill Sans MT", 0, 22)); // NOI18N
        categoria.setForeground(new java.awt.Color(200, 173, 127));
        categoria.setText("jLabel9");
        getContentPane().add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, -1));

        jLabel10.setFont(new java.awt.Font("Gill Sans MT", 3, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(179, 147, 96));
        jLabel10.setText("KM:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        estado.setFont(new java.awt.Font("Gill Sans MT", 0, 22)); // NOI18N
        estado.setForeground(new java.awt.Color(200, 173, 127));
        estado.setText("jLabel11");
        getContentPane().add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, -1, -1));

        cv.setFont(new java.awt.Font("Gill Sans MT", 0, 22)); // NOI18N
        cv.setForeground(new java.awt.Color(200, 173, 127));
        cv.setText("Estado:");
        getContentPane().add(cv, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, -1, -1));

        jLabel13.setFont(new java.awt.Font("Gill Sans MT", 3, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(179, 147, 96));
        jLabel13.setText("CV:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, -1, -1));

        jLabel14.setFont(new java.awt.Font("Gill Sans MT", 3, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(179, 147, 96));
        jLabel14.setText("Estado:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        km.setFont(new java.awt.Font("Gill Sans MT", 0, 22)); // NOI18N
        km.setForeground(new java.awt.Color(200, 173, 127));
        km.setText("Estado:");
        getContentPane().add(km, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIX/spa.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 110));

        preciotxt.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        preciotxt.setForeground(new java.awt.Color(200, 173, 127));
        preciotxt.setText("Precio:");
        getContentPane().add(preciotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, -1, -1));

        btnComprar.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        btnComprar.setForeground(new java.awt.Color(200, 173, 127));
        btnComprar.setText("Comprar");
        btnComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, 110, 40));

        precio.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        precio.setForeground(new java.awt.Color(200, 173, 127));
        precio.setText("999");
        getContentPane().add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, -1, -1));

        btnComprar1.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        btnComprar1.setForeground(new java.awt.Color(200, 173, 127));
        btnComprar1.setText("Agregar");
        btnComprar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 110, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIX/grisoscuro.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTodosActionPerformed
        precio.setVisible(false);
        preciotxt.setVisible(false);
        btnComprar.setVisible(false);
        String sql = "SELECT modelo FROM coches ;";
        try {
            Connection conexion = Conex.devolverConex();
            PreparedStatement sentecia = (PreparedStatement) conexion.prepareStatement(sql);
            ResultSet rs = sentecia.executeQuery();
            model1.removeAllElements();

            while (rs.next()) {
                model1.addElement(rs.getString("modelo"));
            }
            rs.close();
            sentecia.close();
            Conex.CerrarConex();

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_rbTodosActionPerformed

    private void rbDispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDispActionPerformed
        precio.setVisible(true);
        preciotxt.setVisible(true);
        btnComprar.setVisible(true);

        String sql = "SELECT modelo FROM coches  WHERE NOT EXISTS (SELECT n_bastidor FROM ventas WHERE n_bastidor = coches.n_bastidor );";
        try {
            Connection conexion = Conex.devolverConex();
            PreparedStatement sentecia = (PreparedStatement) conexion.prepareStatement(sql);
            ResultSet rs = sentecia.executeQuery();
            model1.removeAllElements();
            while (rs.next()) {
                model1.addElement(rs.getString("modelo"));
            }
            Conex.CerrarConex();

        } catch (Exception e) {
            System.out.println(e);

        }
    }//GEN-LAST:event_rbDispActionPerformed

    private void rpVendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rpVendidosActionPerformed
        precio.setVisible(false);
        preciotxt.setVisible(false);
        btnComprar.setVisible(false);

        String sql = "SELECT modelo FROM coches  WHERE  EXISTS (SELECT n_bastidor FROM ventas WHERE n_bastidor = coches.n_bastidor );";
        try {
            Connection conexion = Conex.devolverConex();
            PreparedStatement sentecia = (PreparedStatement) conexion.prepareStatement(sql);
            ResultSet rs = sentecia.executeQuery();
            model1.removeAllElements();
            for (; rs.next();) {
                model1.addElement(rs.getString("modelo"));
            }
            Conex.CerrarConex();

        } catch (Exception e) {
            System.out.println(e);

        }
    }//GEN-LAST:event_rpVendidosActionPerformed

    private void modelCochesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelCochesActionPerformed
        if (model1.getSelectedItem() != null) {
            modelo.setVisible(true);
            marca.setVisible(true);
            estado.setVisible(true);
            categoria.setVisible(true);
            km.setVisible(true);
            cv.setVisible(true);
            jLabel1.setVisible(true);
            String sql = "SELECT n_bastidor,modelo,marca,categoria,estado,km,cv,precio,ref FROM coches  WHERE modelo like ?;";
            try {
                Connection conexion = Conex.devolverConex();
                PreparedStatement sentecia = (PreparedStatement) conexion.prepareStatement(sql);
                sentecia.setString(1, (String) model1.getSelectedItem());
                ResultSet rs = sentecia.executeQuery();
                if (rs.next()) {
                    modeloC = rs.getString("modelo");
                    n_bastidorC = rs.getString("n_bastidor");
                    modelo.setText(modeloC);
                    precioC = (long) (rs.getLong("precio") * 1.33);
                    marca.setText(rs.getString("marca"));
                    categoria.setText(rs.getString("categoria"));
                    estado.setText(rs.getString("estado"));
                    km.setText(String.valueOf(rs.getInt("km")));
                    cv.setText(String.valueOf(rs.getInt("cv")));
                    precio.setText(String.valueOf(precioC) + "€");
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/coches/" + rs.getString("ref"))));
                }

                Conex.CerrarConex();

            } catch (Exception e) {
                System.out.println(e);

            }
        }
    }//GEN-LAST:event_modelCochesActionPerformed

    private void btnComprar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprar1ActionPerformed
        AgregarCoche ag = new AgregarCoche();
        ag.setVisible(true);
    }//GEN-LAST:event_btnComprar1ActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        ComprarCoche cc = new ComprarCoche(email, modeloC, n_bastidorC,precioC);
        cc.setVisible(true);
    }//GEN-LAST:event_btnComprarActionPerformed

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
            java.util.logging.Logger.getLogger(Coches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Coches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Coches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Coches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Coches("admin@gmail.com").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnComprar1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel categoria;
    private javax.swing.JLabel cv;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel km;
    private javax.swing.JLabel marca;
    private javax.swing.JComboBox<String> modelCoches;
    private javax.swing.JLabel modelo;
    private javax.swing.JLabel precio;
    private javax.swing.JLabel preciotxt;
    private javax.swing.JRadioButton rbDisp;
    private javax.swing.JRadioButton rbTodos;
    private javax.swing.JRadioButton rpVendidos;
    // End of variables declaration//GEN-END:variables
}
