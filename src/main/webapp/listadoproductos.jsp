<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %> 
<%@page import="java.util.*" %>
<%@page import="model.TblProductocl2" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de Productos</title>
</head>
<body>

<h1>Listado de Productos</h1>
<h2><a href="insertarproductos.jsp">Registrar Producto</a></h2> 
<table align="center" border="2">
<tr>
    <th>Codigo</th>
    <th>Nombre</th>
    <th>Precio Venta</th>
    <th>Precio Compra</th>
    <th>Estado</th>
    <th>Descripción</th>
   
</tr>

<%
    // Obtener la lista de clientes desde el atributo de solicitud
    List<TblProductocl2> listaDeProductos = (List<TblProductocl2>) request.getAttribute("ListadoProductos");
    if (listaDeProductos != null) {
        for (TblProductocl2 producto : listaDeProductos) {
%>
    <tr>
        <td><%= producto.getIdproductocl2() %></td>
        <td><%= producto.getNombrecl2() %></td>
        <td><%= producto.getPrecioventacl2() %></td>
        <td><%= producto.getPreciocompcl2() %></td>
        <td><%= producto.getEstadocl2() %></td>
        <td><%= producto.getDescripcl2()%></td>
         %></td>
    </tr>
<%
        }
    } else {
%>
    <tr>
        <td colspan="8">No se encontraron Productos.</td>
    </tr>
<%
    }
%>
</table>

</body>
</html>
