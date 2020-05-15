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
public class Clientes {
    private int cedula;
    private String nombres;
    private String apellidos;
    private String ciudad;
    private String municipio;
    private String residencia;
    private String fechaNacimiento;
    private String tipoDocumento;

    public Clientes(int cedula, String nombres, String apellidos, String ciudad, String municipio, String residencia, String fechaNacimiento, String tipoDocumento) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ciudad = ciudad;
        this.municipio = municipio;
        this.residencia = residencia;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoDocumento = tipoDocumento;
    }

    public Clientes() {
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    
}
