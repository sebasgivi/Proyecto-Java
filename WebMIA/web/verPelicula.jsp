<%@include file="header.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
entramos a verPElicula
${System.out.println("HOLAASAAS")}
peliculSS:${Pelis}
<td></td>

<table style=" text-align: center">
    <tr>
        <th width="180">Pelicula</th>
        <th width="120">Puntuacion</th>
        <th width="120">Funciones Posibles</th>
    </tr>

    <c:forEach items="${Pelis}" var="pro">
        <tr>
            <td>${pro.getNombre()}</td>
            <td>${pro.getPuntuacion()}</td>
            <td>
                <c:if test="${not empty pro.getListaFunciones_()}">
                    <c:forEach var="p" items="${pro.getListaFunciones_()}">
                        ${p.getHoraDeFuncion()}:00/
                    </c:forEach>
                        pm
                </c:if>
                <c:if test="${empty pro.getListaFunciones_()}">
                    <p>No se han asignado Funciones a esta pelicula</p>
                </c:if>
            </td>
        </tr>
    </c:forEach>
</table>
<%@include file="footer.jsp" %>