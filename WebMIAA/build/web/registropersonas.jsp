<%@include file="header.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<form method="POST" action="./Personas">
    Nombre: <input type="text" name="nombre" required /><br /><br />
    Apellido: <input type="text" name="apellido" required /><br /><br />
    Correo: <input type="email" name="correo" required /><br /><br />
    Edad: <input type="text" name="edad" required /><br /><br />
    clave: <input type="password" name="clave" required/><br /><br />
    tipo provicional: <select name="Admin/Usuario">
        <option value="1">Usuario</option> 
        <option value="2">Administrador</option> 
    </select><br /><br />
    <input type="submit" value="Registrar" />
</form>
 VEA ${aPersona}
<c:if test="${aPersona != null}">
    <table style=" text-align: center">

        <tr>
            <th width="120">Nombre</th>
            <th width="120">Apellido</th>
            <th width="120">correo:</th>
            <th width="120">Edad</th>
            <th width="120">clave</th>
            <th width="120">Usuario/Administrador </th>
        </tr>
        <c:if test="${aPersona.getCorreo() != null}">
            <tr>
                <td>${aPersona.getNombre()}</td>
                <td>${aPersona.getApellido()}</td>
                <td>${aPersona.getCorreo()}</td>
                <td>${aPersona.getEdad()}</td>
                <td>${aPersona.getClave()}</td>
                <td>${aPersona.getTipo()}</td>
            </tr>
        </c:if>
    </table>

</c:if>
<%@include file="footer.jsp" %>
