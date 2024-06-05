/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package trabajojoseluis;

import javax.swing.table.DefaultTableModel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAW
 */
public class UsuariosTest {
    
    public UsuariosTest() {
    }

    /**
     * Test of RellenarDatos method, of class Usuarios.
     */
    @Test
    public void testRellenarDatos() {
        System.out.println("RellenarDatos");
        String campo = "2";
        DefaultTableModel dtm = null;
        String nombre = "alex";
        String dni = "71318889a";
        Usuarios instance = null;
        instance.RellenarDatos(campo, dtm, nombre, dni);
        
    }

   
    
}
