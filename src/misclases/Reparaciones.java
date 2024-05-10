/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misclases;

/**
 *
 * @author code
 */
public class Reparaciones {
    String dni_mecanico,n_reparacion,fecha_inicio,descp,fecha_fin;

    public Reparaciones(String dni_mecanico, String n_reparacion, String fecha_inicio, String descp, String fecha_fin) {
        this.dni_mecanico = dni_mecanico;
        this.n_reparacion = n_reparacion;
        this.fecha_inicio = fecha_inicio;
        this.descp = descp;
        this.fecha_fin = fecha_fin;
    }

    public String getDni_mecanico() {
        return dni_mecanico;
    }

    public void setDni_mecanico(String dni_mecanico) {
        this.dni_mecanico = dni_mecanico;
    }

    public String getN_reparacion() {
        return n_reparacion;
    }

    public void setN_reparacion(String n_reparacion) {
        this.n_reparacion = n_reparacion;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getDescp() {
        return descp;
    }

    public void setDescp(String descp) {
        this.descp = descp;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
    
}
