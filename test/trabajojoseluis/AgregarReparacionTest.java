/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package trabajojoseluis;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAW
 */
public class AgregarReparacionTest {
    
    public AgregarReparacionTest() {
    }

   

    

    

    /**
     * Test of Comprobaciones method, of class AgregarReparacion.
     */
    @Test
    public void testComprobaciones() {
        System.out.println("Comprobaciones");
        AgregarReparacion instance = new AgregarReparacion();
        boolean expResult = false;
        boolean result = instance.Comprobaciones();
        assertEquals(expResult, result);
    }
    
}
