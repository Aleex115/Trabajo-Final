/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misclases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author code
 */
public class Vendedores {

    String dni, nombre, email, passwd;
    int numero, sueldo;

    public Vendedores(String dni, String nombre, String email, int numero, int sueldo, String passwd) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.numero = numero;
        this.sueldo = sueldo;
        this.passwd = passwd;

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    public String comprobarContraseña(String email){
        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "alex", "daww");

        } catch (Exception e) {
            System.out.println("Error e");
        }
        return "s";
    }

}
