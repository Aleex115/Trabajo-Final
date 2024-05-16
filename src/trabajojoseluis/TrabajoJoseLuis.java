/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajojoseluis;

import static misclases.Encriptador.authenticatePassword;
import static misclases.Encriptador.encryptPassword;


/**
 *
 * @author code
 */
public class TrabajoJoseLuis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String password = "alex";
        String encryptedPassword = encryptPassword(password);
        
        System.out.println("Contraseña encriptada: " + encryptedPassword.length());
                
                        boolean isAuthenticated = authenticatePassword("tu_contraseñ", "6ee63691221a0e8d80daae2b9e841114f8bdb7f097bc8dbe2627d0ddc8ac1dda");
        if (isAuthenticated) {
            System.out.println("Contraseña válida. El usuario está autenticado.");
        } else {
            System.out.println("Contraseña inválida. La autenticación falló.");
        }

    }
    
}
