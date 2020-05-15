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
public class Tienda {
    private int id;
    private String nombre;
    private String direccion;
    private String ciudad;
    private String municipio;
    private int idEmpleos;
    private int idBodega;
    private int idClientes;
    private int idAdmin;
    private int telefonoCelular;
    private int telefonoFijo;
    private int idproveedor;

    public Tienda(int id, String nombre, String direccion, String ciudad, String municipio, int idEmpleos, int idBodega, int idClientes, int idAdmin, int telefonoCelular, int telefonoFijo, int idproveedor) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.municipio = municipio;
        this.idEmpleos = idEmpleos;
        this.idBodega = idBodega;
        this.idClientes = idClientes;
        this.idAdmin = idAdmin;
        this.telefonoCelular = telefonoCelular;
        this.telefonoFijo = telefonoFijo;
        this.idproveedor = idproveedor;
    }

    public Tienda() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public int getIdEmpleos() {
        return idEmpleos;
    }

    public void setIdEmpleos(int idEmpleos) {
        this.idEmpleos = idEmpleos;
    }

    public int getIdBodega() {
        return idBodega;
    }

    public void setIdBodega(int idBodega) {
        this.idBodega = idBodega;
    }

    public int getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public int getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(int telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public int getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(int telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }
    
    
}
