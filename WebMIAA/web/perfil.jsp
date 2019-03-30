<%@include file="header.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<table style=" text-align: center">
    <tr><th width="180">Nombre:</th><td>${Usuario.getNombre()}</td></tr>
    <tr><th width="120">Apellido:</th><td>${Usuario.getApellido()}</td></tr>
        <th width="120">correo:</th>
        <th width="120">Edad</th>
        <th width="120">clave</th>
        <th width="120">Usuario/Administrador </th>
    <tr>
        
        
        <td>${aPersona.getCorreo()}</td>
        <td>${aPersona.getEdad()}</td>
        <td>${aPersona.getClave()}</td>
        <td>${aPersona.getTipo_()}</td>
    </tr>
</table>
<a href="./PeliculasUsuario">Volver</a>
<%@include file="footer.jsp" %>