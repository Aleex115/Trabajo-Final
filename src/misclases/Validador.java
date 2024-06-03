package misclases;

import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 * La clase Validador proporciona métodos para validar diversos tipos de datos
 * como correos electrónicos, DNI, sueldos, números de teléfono y números de bastidor.
 */
public class Validador {

    /**
     * Valida si un correo electrónico es válido según un patrón específico.
     *
     * @param email el correo electrónico a validar.
     * @param comp el componente desde el cual se invoca el método, utilizado para mostrar mensajes.
     * @return true si el correo electrónico es válido, de lo contrario false.
     */
    public static boolean validarEmail(String email, Component comp) {
        Pattern pat = Pattern.compile("[a-zA-Z0-9]{3,}@[a-zA-Z]{3,}\\.[a-zA-Z]{2,3}");
        Matcher mat = pat.matcher(email);
        if (!mat.find()) {
            JOptionPane.showMessageDialog(comp, "El texto no es un correo");
            return false;
        }
        return true;
    }

    /**
     * Valida si un DNI es válido según un patrón específico.
     *
     * @param dni el DNI a validar.
     * @param comp el componente desde el cual se invoca el método, utilizado para mostrar mensajes.
     * @return true si el DNI es válido, de lo contrario false.
     */
    public static boolean validarDNI(String dni, Component comp) {
        Pattern pat = Pattern.compile("[0-9]{8}[a-zA-Z]{1}");
        Matcher mat = pat.matcher(dni);
        if (!mat.find()) {
            JOptionPane.showMessageDialog(comp, "El texto no es un dni");
            return false;
        }
        return true;
    }

    /**
     * Valida si un sueldo está dentro del rango especificado (20,000 a 60,000).
     *
     * @param sueldo el sueldo a validar.
     * @param comp el componente desde el cual se invoca el método, utilizado para mostrar mensajes.
     * @return true si el sueldo está dentro del rango, de lo contrario false.
     */
    public static boolean validarSueldo(int sueldo, Component comp) {
        if (sueldo < 20000 || sueldo > 60000) {
            JOptionPane.showMessageDialog(comp, "No es un sueldo válido");
            return false;
        }
        return true;
    }

    /**
     * Valida si un número de teléfono está dentro del rango especificado (600000000 a 800000000).
     *
     * @param num el número de teléfono a validar.
     * @param comp el componente desde el cual se invoca el método, utilizado para mostrar mensajes.
     * @return true si el número de teléfono está dentro del rango, de lo contrario false.
     */
    public static boolean validarNumero(int num, Component comp) {
        if (num < 600000000 || num > 800000000) {
            JOptionPane.showMessageDialog(comp, "No es un número válido");
            return false;
        }
        return true;
    }

    /**
     * Valida si un número de bastidor es válido según un patrón específico.
     *
     * @param n el número de bastidor a validar.
     * @param comp el componente desde el cual se invoca el método, utilizado para mostrar mensajes.
     * @return true si el número de bastidor es válido, de lo contrario false.
     */
    public static boolean validarN_bastidor(String n, Component comp) {
        Pattern pat = Pattern.compile("[a-zA-Z0-9]{20}");
        Matcher mat = pat.matcher(n);
        if (!mat.find()) {
            JOptionPane.showMessageDialog(comp, "El texto no es un número de bastidor");
            return false;
        }
        return true;
    }
}
