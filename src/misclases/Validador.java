/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misclases;

import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Validador {
    /**
     * Metodo que valida un correo electronico
     * @param email es el email a validar
     * @param comp es la ventana sobre la que se va a mostrar el joption
     * @return devuelve verdadero o falso segun cumpla o no el patron
     */
    public static boolean validarEmail(String email,Component comp){
        Pattern pat = Pattern.compile("[a-zA-Z0-9]{3,}@[a-zA-Z]{3,}\\.[a-zA-Z]{2,3}");
        Matcher mat = pat.matcher(email);
        if(!mat.find()){
            JOptionPane.showMessageDialog(comp, "El texto no es un correo");
            return false;
        }
        return true;
    }
    /**
     * Metodo que valida un dni
     * @param dni es el dni a validar
     * @param comp es la ventana sobre la que se va a mostrar el joption
     * @return devuelve verdadero o falso segun cumpla o no el patron
     */
    public static boolean validarDNI(String dni,Component comp){
        Pattern pat = Pattern.compile("[0-9]{8}[a-zA-Z]{1}");
        Matcher mat = pat.matcher(dni);
        if(!mat.find()){
            JOptionPane.showMessageDialog(comp, "El texto no es un dni");
            return false;
        }
        return true;
    }
    public static boolean validarSueldo(int sueldo,Component comp){
        if(sueldo < 20000 && sueldo > 60000){
            JOptionPane.showMessageDialog(comp, "No es un sueldo");
            return false;
        }
        return true;
    }
    public static boolean validarNumero(int num,Component comp){
        if(num < 600000000 && num > 800000000){
            JOptionPane.showMessageDialog(comp, "No es un numero");
            return false;
        }
        return true;
    }
}
