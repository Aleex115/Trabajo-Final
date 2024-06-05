/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package misclases;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAW
 */
public class EncriptadorTest {

    public EncriptadorTest() {
    }

    /**
     * Test of authenticatePassword method, of class Encriptador.
     */
    @Test
    public void testAuthenticatePassword() throws NoSuchAlgorithmException {
        System.out.println("authenticatePassword");
        String inputPassword = "hola";
        String hashedPassword = "hola";
        MessageDigest digest = MessageDigest.getInstance("SHA-256");

        byte[] hash = digest.digest(hashedPassword.getBytes());

        StringBuilder hexString = new StringBuilder();
        for (byte b : hash)
        {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1)
            {
                hexString.append('0');
            }
            hexString.append(hex);
        }

        String hashedPass = hexString.toString();
        boolean expResult = true;
        boolean result = Encriptador.authenticatePassword(inputPassword, hashedPass);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of encryptPassword method, of class Encriptador.
     */
    @Test
    public void testEncryptPassword() throws NoSuchAlgorithmException {
        System.out.println("encryptPassword");
        String password = "hola";

        MessageDigest digest = MessageDigest.getInstance("SHA-256");

        byte[] hash = digest.digest(password.getBytes());

        StringBuilder hexString = new StringBuilder();
        for (byte b : hash)
        {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1)
            {
                hexString.append('0');
            }
            hexString.append(hex);
        }

        String expResult = hexString.toString();
        String result = Encriptador.encryptPassword(password);
        assertEquals(expResult, result);
        
    }

}
