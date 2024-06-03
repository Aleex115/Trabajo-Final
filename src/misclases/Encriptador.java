package misclases;

import java.security.*;

/**
 * La clase Encriptador proporciona métodos para encriptar contraseñas
 * y autenticar contraseñas encriptadas usando el algoritmo SHA-256.
 */
public class Encriptador {

    /**
     * Autentica una contraseña comparándola con una contraseña encriptada.
     *
     * @param inputPassword la contraseña proporcionada por el usuario.
     * @param hashedPassword la contraseña encriptada almacenada.
     * @return true si la contraseña proporcionada coincide con la contraseña encriptada, de lo contrario false.
     */
    public static boolean authenticatePassword(String inputPassword, String hashedPassword) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            byte[] hashedInputPassword = digest.digest(inputPassword.getBytes());

            StringBuilder inputPasswordHex = new StringBuilder();
            for (byte b : hashedInputPassword) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    inputPasswordHex.append('0');
                }
                inputPasswordHex.append(hex);
            }

            return inputPasswordHex.toString().equals(hashedPassword);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Encripta una contraseña usando el algoritmo SHA-256.
     *
     * @param password la contraseña que se desea encriptar.
     * @return la representación en cadena hexadecimal de la contraseña encriptada,
     *         o null si ocurre un error durante la encriptación.
     */
    public static String encryptPassword(String password) {
        try {
            // Crear un objeto MessageDigest para SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Aplicar el algoritmo de hash a la contraseña
            byte[] hash = digest.digest(password.getBytes());

            // Convertir el hash byte[] a una cadena hexadecimal
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            // Manejar la excepción en caso de que el algoritmo no esté disponible
            e.printStackTrace();
            return null;
        }
    }
}
