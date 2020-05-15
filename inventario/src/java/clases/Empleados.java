/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author levd
 */
public class Empleados {
    private int Cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String ciudad;
    private String fechaNacimiento;

    public Empleados(int Cedula, String nombre, String apellido, String direccion, String ciudad, String fechaNacimiento) {
        this.Cedula = Cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Empleados() {
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
}
