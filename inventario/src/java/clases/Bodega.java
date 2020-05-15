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
public class Bodega {
    private int idbodega;
    private String ciudad;
    private String direccion;
    private int idproducto;

    public Bodega(int idbodega, String ciudad, String direccion, int idproducto) {
        this.idbodega = idbodega;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.idproducto = idproducto;
    }

    public int getIdbodega() {
        return idbodega;
    }

    public void setIdbodega(int idbodega) {
        this.idbodega = idbodega;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public Bodega() {
    }
    
}
