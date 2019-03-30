<%@include file="header.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<c:if test="${empty funcionDePelicula}">
    <p>El cine no tiene peliculas actualmente//</p>
</c:if>
    <p> ENRTRO</p>
<c:if test="${not empty funcionDePelicula}">
    <p>AQUEI SI ENTRO MAS//</p>
    <table style=" text-align: center">
        <tr>
        <td width='180px'>
            Funciones:  <3     
        </td>
        </tr>
    <c:forEach items="${funcionDePelicula}" var="pro">
        <p>ENTRO del TODO//</p>
        <tr>
            
            <td><a>${pro.getPelicula()}</a></td>
            <td><a>${pro.getSala()}</a></td>
            <td><a>${pro.getHoraDeFuncion()}</a></td>
            <td><a>${pro.getSillasDisponibles()}</a></td>
            <td><a>${pro.getFormato()}</a></td>
            
        </tr>
    </c:forEach>
</table>
</c:if>
    <a href="./VerPelicula?pelicula=${request.getParameter("Pelicula")}">Volver</a>
<%@include file="footer.jsp" %>