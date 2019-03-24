<%@include file="header.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<form method="POST" action="./Personas">
    Nombre: <input type="text" name="nombre" required /><br /><br />
    Apellido: <input type="text" name="apellido" required /><br /><br />
    Numero de Identificacion: <input type="text" name="id" required /><br /><br />
    Edad: <input type="text" name="edad" required /><br /><br />
    clave: <input type="password" name="clave" required/><br /><br />
    <input type="submit" value="Registrar" />
</form>
<c:if test="${not empty listaPersonas}">
    <table style=" text-align: center">

        <tr>
            <th width="120">Nombre</th>
            <th width="120">Apellido</th>
            <th width="120">Nro.Identificacion</th>
            <th width="120">Edad</th>
            <th width="120">clave</th>
        </tr>
        <c:forEach items="${listaPersonas}" var="pro">
            <c:if test="${pro.getNumeroIdentificacion() != 0}">
                <tr>
                    <td>${pro.getNombre()}</td>
                    <td>${pro.getApellido()}</td>
                    <td>${pro.getNumeroIdentificacion()}</td>
                    <td>${pro.getEdad()}</td>
                    <td>${pro.getClave()}</td>

                </tr>
            </c:if>
        </c:forEach>


    </table>

</c:if>
<%@include file="footer.jsp" %>
