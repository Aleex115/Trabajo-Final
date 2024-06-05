/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package misclases;

import com.mysql.jdbc.Connection;
import java.awt.Component;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAW
 */
public class ConexTest {
    
    public ConexTest() {
    }

    /**
     * Test of devolverConex method, of class Conex.
     */
    @Test
    public void testDevolverConex() throws SQLException {
        System.out.println("devolverConex");
        Component comp = null;
        Connection conexion =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost/trabajo?useSSL=false", "joseluis", "joseluis");
        Connection expResult = conexion ;
        Connection result = Conex.devolverConex(comp);
        assertEquals(expResult, result);
        
    }

    
    
}
