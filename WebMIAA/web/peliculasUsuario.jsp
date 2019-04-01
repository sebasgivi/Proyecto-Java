<%@include file="header.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<c:if test="${empty Pelis}">
    <p>El cine no tiene peliculas actualmente</p>
</c:if>
<c:if test="${not empty Pelis}">
    <table style=" text-align: center">
        <tr>
        <td width='180px'>
            Pelicula:
        </td>
        </tr>
    <c:forEach items="${Pelis}" var="pelicula">
        <tr>
            <td><a href="./VerPelicula?pelicula=${pelicula.getNombre()}">${pelicula.getNombre()}</a></td>
        </tr>
    </c:forEach>
</table>
</c:if>
<%@include file="footer.jsp" %>