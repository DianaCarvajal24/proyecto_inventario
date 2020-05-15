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
public class Proveedor {
    private int cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String ciudad;
    private String fechaNacimiento;
    private String productoProveedor;
    private String descripcionProducto;
    private int telefonoCelular;

    public Proveedor(int cedula, String nombre, String apellido, String direccion, String ciudad, String fechaNacimiento, String productoProveedor, String descripcionProducto, int telefonoCelular) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.fechaNacimiento = fechaNacimiento;
        this.productoProveedor = productoProveedor;
        this.descripcionProducto = descripcionProducto;
        this.telefonoCelular = telefonoCelular;
    }

    public Proveedor() {
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
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

    public String getProductoProveedor() {
        return productoProveedor;
    }

    public void setProductoProveedor(String productoProveedor) {
        this.productoProveedor = productoProveedor;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public int getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(int telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }
    
}
