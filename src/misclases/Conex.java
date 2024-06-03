/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misclases;

import com.mysql.jdbc.Connection;
import java.awt.Component;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author code
 */
public class Conex {

    static Connection conexion;

    public static Connection devolverConex(Component comp) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/trabajo?useSSL=false", "joseluis", "joseluis");

        } catch (com.mysql.jdbc.CommunicationsException e)
        {
            JOptionPane.showMessageDialog(comp, "Base de datos no conectada");
        } catch (Exception ex)
        {
            System.out.println(ex);
        }
        return conexion;
    }

    public static void CerrarConex() {
        try
        {
            conexion.close();
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }

}
