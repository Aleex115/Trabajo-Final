/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misclases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author code
 */
public class Conex {

    static Connection conexion;

    public static Connection devolverConex() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
             conexion= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/trabajo?useSSL=false", "alex", "daw");
        } catch (Exception e) {
            System.out.println(e);
        }
        return conexion;
    }
    public static void CerrarConex(){
        try{
            conexion.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
