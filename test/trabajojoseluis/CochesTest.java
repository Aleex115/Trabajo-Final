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
public class CochesTest {
    
    public CochesTest() {
    }

    /**
     * Test of Iniciar method, of class Coches.
     */
    @Test
    public void testIniciar() {
        System.out.println("Iniciar");
        Coches instance = new Coches("admin@gmail.com");
        instance.Iniciar();
       
    }

    /**
     * Test of main method, of class Coches.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Coches.main(args);
        
    }
    
}
