<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registrar Producto</title>
</head>
<body>

<h1 align="center">Registrar Producto </h1>
<form action="controladorProductos" method="post">
<table align="center">
<tr>
<td>Nombre</td>
<td> <input type="text" name="nombre"></td>
</tr>
<tr>
<td>Precio Venta</td>
<td> <input type="text" name="preve"></td>
</tr>
<tr>
<td>Precio Compra</td>
<td> <input type="text" name="preco"></td>
</tr>
<tr>
<td>Estado</td>
<td> <input type="text" name="est"></td>
</tr>
<tr>
<td>Descripción</td>
<td> <input type="text" name="desc"></td>
<td colspan="2" style ="text-aling:center"> <input type="submit"  value="Registrar"></td>
</tr>
</table>

</form>
</body>
</html>