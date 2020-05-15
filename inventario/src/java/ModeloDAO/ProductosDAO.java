/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import clases.Productos;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author levd
 */
public class ProductosDAO implements CRUD{
 Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Productos p=new Productos();
    @Override
    public List listar() {
    ArrayList<Productos>list=new ArrayList<>();
            String sql="select * from persona";
            try {
                con=cn.getConnection();
                ps=con.prepareStatement(sql);
                rs=ps.executeQuery();
                while(rs.next()){
                    Productos pro=new Productos();
                    pro.setId(rs.getInt("Id"));
                    pro.setNombre(rs.getString("Nombre"));
                    pro.setDescripcion(rs.getString("Descripcion"));
                    pro.setTipoProducto(rs.getString("TipoProducto"));
                    list.add(pro);
                }
            } catch (Exception e) {
    }
        return list;    }

    @Override
    public Productos list(int id) {
    String sql="select * from persona where Id="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                p.setId(rs.getInt("Id"));
                p.setNombre(rs.getString("Nombre"));
                p.setDescripcion(rs.getString("Descripcion Producto"));
                p.setTipoProducto(rs.getString("Tipo producto"));
                
            }
        } catch (Exception e) {
        }
        return p;    }

    @Override
    public boolean add(Productos pro) {
    String sql="insert into persona(DNI, Nombres)values('"+pro.getId()+"','"+pro.getNombre()+"','"+pro.getDescripcion()+"','"+pro.getTipoProducto()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;    }

    @Override
    public boolean edit(Productos pro) {
  String sql="update persona set get Tipo Producto ='"+pro.getTipoProducto()+"',Nombres='"+pro.getNombre()+"',Descripcion='"+"'where Id="+pro.getId();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;    }

    @Override
    public boolean eliminar(int id) {
  String sql="delete from persona where Id="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;    }
    
}
