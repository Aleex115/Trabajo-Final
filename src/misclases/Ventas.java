/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misclases;

/**
 *
 * @author code
 */
public class Ventas {
    String n_bastidor,dni_empleado,dni_cliente,fecha;
    int precio_venta;

    public Ventas(String n_bastidor, String dni_empleado, String dni_cliente, String fecha, int precio_venta) {
        this.n_bastidor = n_bastidor;
        this.dni_empleado = dni_empleado;
        this.dni_cliente = dni_cliente;
        this.fecha = fecha;
        this.precio_venta = precio_venta;
    }

    public String getN_bastidor() {
        return n_bastidor;
    }

    public void setN_bastidor(String n_bastidor) {
        this.n_bastidor = n_bastidor;
    }

    public String getDni_empleado() {
        return dni_empleado;
    }

    public void setDni_empleado(String dni_empleado) {
        this.dni_empleado = dni_empleado;
    }

    public String getDni_cliente() {
        return dni_cliente;
    }

    public void setDni_cliente(String dni_cliente) {
        this.dni_cliente = dni_cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(int precio_venta) {
        this.precio_venta = precio_venta;
    }
    
}
