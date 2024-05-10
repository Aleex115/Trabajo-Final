/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misclases;

/**
 *
 * @author code
 */
public class Coches {
    
    String n_bastidor,estado,categoria,marca,modelo,dni_proveedor,fecha;
    int precio,km,cv;

    public Coches(String n_bastidor, String estado, String categoria, String marca, String modelo, String dni_proveedor, String fecha, int precio, int km, int cv) {
        this.n_bastidor = n_bastidor;
        this.estado = estado;
        this.categoria = categoria;
        this.marca = marca;
        this.modelo = modelo;
        this.dni_proveedor = dni_proveedor;
        this.fecha = fecha;
        this.precio = precio;
        this.km = km;
        this.cv = cv;
    }

    public String getN_bastidor() {
        return n_bastidor;
    }

    public void setN_bastidor(String n_bastidor) {
        this.n_bastidor = n_bastidor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDni_proveedor() {
        return dni_proveedor;
    }

    public void setDni_proveedor(String dni_proveedor) {
        this.dni_proveedor = dni_proveedor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

}
