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
public class LoginTest {
    
    public LoginTest() {
    }

    /**
     * Test of comprobarContraseña method, of class Login.
     */
    @Test
    public void testComprobarContraseña() {
        System.out.println("comprobarContrase\u00f1a");
        String email = "admin@gmail.com";
        String passwd = "alex";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.comprobarContraseña(email, passwd);
        assertEquals(expResult, result);
        
    }

    
    
}
