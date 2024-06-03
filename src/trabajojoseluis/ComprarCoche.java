/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabajojoseluis;

import com.mysql.jdbc.CommunicationsException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import misclases.Conex;
import misclases.EscribirPDF;

/**
 *
 * @author code
 */
public class ComprarCoche extends javax.swing.JFrame {

    /**
     * Creates new form ComprarCoche
     */
    String email, modelo, nbastidor, dni, cliente, vendedor;
    DefaultComboBoxModel<String> model1 = new DefaultComboBoxModel<>();
    ArrayList<String> dniC = new ArrayList<>();
    LocalDateTime fechaHoraActual = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String fecha = fechaHoraActual.format(formatter);

    public ComprarCoche(String mail, String model, String nb, long precio) {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Comprar coche");
        this.setSize(750, 430);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        email = mail;
        modelo = model;
        nbastidor = nb;
        coche.setText(modelo);
        preciotxt.setText(String.valueOf(precio));
        clientes.setModel(model1);
        AñadirClientes();
        ObtenerDni();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        coche = new javax.swing.JLabel();
        preciotxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        clientes = new javax.swing.JComboBox<>();
        btnComprar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Compra de coches");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        coche.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        coche.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(coche, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 110, 20));

        preciotxt.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        preciotxt.setForeground(new java.awt.Color(20, 20, 20));
        getContentPane().add(preciotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 90, -1));

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cliente:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        clientes.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        clientes.setForeground(new java.awt.Color(255, 255, 255));
        clientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesActionPerformed(evt);
            }
        });
        getContentPane().add(clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, -1));

        btnComprar.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 150, 70));

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Coche:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIX/lambo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 0, 860, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        try {
            if (Long.parseLong(preciotxt.getText()) > 1000) {
                Connection conexion = (Connection) Conex.devolverConex(ComprarCoche.this);
                String sql = "insert into ventas values (? , ?, ?, ?, ?)";
                PreparedStatement sentecia = (PreparedStatement) conexion.prepareStatement(sql);
                sentecia.setString(1, nbastidor);
                sentecia.setString(2, dni);
                sentecia.setString(3, dniC.get(clientes.getSelectedIndex()));
                sentecia.setString(4, fecha);
                sentecia.setLong(5, Long.parseLong(preciotxt.getText()));
                sentecia.executeUpdate();
                JOptionPane.showMessageDialog(this, "Se ha realizado la compra");
                sentecia.close();
                Conex.CerrarConex();
                if (JOptionPane.showConfirmDialog(this, "¿Quieres factura?", "Confirmación", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    EscribirPDF es = new EscribirPDF();
                    es.Escribir(cliente, vendedor, nbastidor, Integer.parseInt(preciotxt.getText()), ComprarCoche.this);
                } else {
                    JOptionPane.showMessageDialog(this, "No se hará factura");
                }
                dispose();
            } else {
                System.out.println("El precio esta mal");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El precio no es un numero");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);

        }

    }//GEN-LAST:event_btnComprarActionPerformed

    private void clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesActionPerformed
        cliente = (String) clientes.getSelectedItem();
    }//GEN-LAST:event_clientesActionPerformed

    public void AñadirClientes() {
        try {
            Connection conexion = (Connection) Conex.devolverConex(ComprarCoche.this);

            PreparedStatement sentecia = (PreparedStatement) conexion.prepareStatement("select dni, nombre from clientes");
            ResultSet rs = sentecia.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                model1.addElement(nombre);
                dniC.add(rs.getString("dni"));
            }
            rs.close();
            sentecia.close();
            Conex.CerrarConex();
        } catch (CommunicationsException e) {
            JOptionPane.showMessageDialog(this, "La base de datos no esta encendida");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
            ;
        }
    }

    public void ObtenerDni() {
        try {
            Connection conexion = (Connection) Conex.devolverConex(ComprarCoche.this);
            String sql = "Select dni,nombre from vendedores where email like ?;";
            PreparedStatement sentecia = (PreparedStatement) conexion.prepareStatement(sql);
            sentecia.setString(1, email);
            ResultSet rs = sentecia.executeQuery();
            rs.next();
            dni = rs.getString(1);
            vendedor = rs.getString(2);
            rs.close();
            sentecia.close();
            Conex.CerrarConex();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JComboBox<String> clientes;
    private javax.swing.JLabel coche;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField preciotxt;
    // End of variables declaration//GEN-END:variables
}
