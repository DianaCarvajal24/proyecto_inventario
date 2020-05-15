<%@page import="ModeloDAO.ProductosDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="clases.Productos"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1>Producto</h1>
            <a class="btn btn-success" href="Controlador?accion=add">Agregar Nuevo</a>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">id</th>
                        <th class="text-center">Nombre</th>
                        <th class="text-center">Descripcion</th>
                        <th class="text-center">Tipo producto</th>
                    </tr>
                </thead>
                <%
                    ProductosDAO dao=new ProductosDAO();
                    List<Productos>list=dao.listar();
                    Iterator<Productos>iter=list.iterator();
                    Productos pro=null;
                    while(iter.hasNext()){
                        pro=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= pro.getId()%></td>
                        
                        <td><%= pro.getNombre()%></td>
                        <td><%= pro.getDescripcion()%></td>
                        <td><%= pro.getTipoProducto()%></td>
                        <td class="text-center">
                            <a class="btn btn-warning" href="Controlador?accion=editar&id=<%= pro.getId()%>">Editar</a>
                            <a class="btn btn-danger" href="Controlador?accion=eliminar&id=<%= pro.getId()%>">Remove</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
</html>
