/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package misclases;

import java.awt.Component;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAW
 */
public class ValidadorTest {
   
    /**
     * Test of validarEmail method, of class Validador.
     */
    @Test
    public void testValidarEmail() {
        System.out.println("validarEmail");
        String email = "ejemplo@gmail.com";
        Component comp = null;
        boolean expResult = true;
        boolean result = Validador.validarEmail(email, comp);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of validarDNI method, of class Validador.
     */
    @Test
    public void testValidarDNI() {
        System.out.println("validarDNI");
        String dni = "71819998p";
        Component comp = null;
        boolean expResult = true;
        boolean result = Validador.validarDNI(dni, comp);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of validarSueldo method, of class Validador.
     */
    @Test
    public void testValidarSueldo() {
        System.out.println("validarSueldo");
        int sueldo = 30000;
        Component comp = null;
        boolean expResult = true;
        boolean result = Validador.validarSueldo(sueldo, comp);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of validarNumero method, of class Validador.
     */
    @Test
    public void testValidarNumero() {
        System.out.println("validarNumero");
        int num = 640896532;
        Component comp = null;
        boolean expResult = true;
        boolean result = Validador.validarNumero(num, comp);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of validarN_bastidor method, of class Validador.
     */
    @Test
    public void testValidarN_bastidor() {
        System.out.println("validarN_bastidor");
        String n = "01234567890123456789";
        Component comp = null;
        boolean expResult = true;
        boolean result = Validador.validarN_bastidor(n, comp);
        assertEquals(expResult, result);
        
    }
    
}
