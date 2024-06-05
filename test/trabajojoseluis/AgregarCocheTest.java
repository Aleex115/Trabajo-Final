/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package trabajojoseluis;

import com.mysql.jdbc.PreparedStatement;
import java.io.File;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAW
 */
public class AgregarCocheTest {
    
    public AgregarCocheTest() {
    }

    
    

    /**
     * Test of Comprobaciones method, of class AgregarCoche.
     */
    @Test
    public void testComprobaciones() {
        System.out.println("Comprobaciones");
        AgregarCoche instance = new AgregarCoche();
        boolean expResult = false;
        boolean result = instance.Comprobaciones();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getExtension method, of class AgregarCoche.
     */
    @Test
    public void testGetExtension() {
        System.out.println("getExtension");
        File file = new File("src/misclases/Conex.java");
        AgregarCoche instance = new AgregarCoche();
        String expResult = "java";
        String result = instance.getExtension(file);
        assertEquals(expResult, result);
        
    }

    

    
}
