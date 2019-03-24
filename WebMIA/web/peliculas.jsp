<%@include file="header.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<form method="POST" action="./Peliculas">
    Name: <input type="text" name="name" required /><br /><br />
    Genero: <input type="text" name="genero" required/><br /><br />
    Edad: <input type="text" name="edad" required/><br /><br />
    Valoracion: <input type="text" name="valoracion" required/><br /><br />
    <input type="submit" value="Guardar" />
</form>

<c:if test="${not empty pelis}">
    <table style=" text-align: center">
        <tr>
            <th width="120">Name</th>
            <th width="120">Genero</th>
            <th width="120">Edad</th>
            <th width="120">Valoracion</th>
        </tr>
        <c:forEach items="${pelis}" var="pro">
            <c:if test="${pro.getNombre() != null}">
                <tr>
                    <td>${pro.getNombre()}</td>
                    <td>${pro.getGenero()}</td>
                    <td>${pro.getEdad()}</td>
                    <td>${pro.getPuntuacion()}</td>
                </tr>
            </c:if>
        </c:forEach>
    </table>
</c:if>
<%@include  file="footer.jsp" %>
