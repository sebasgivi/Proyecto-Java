<%@include file="header.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<c:if test="${funcion != null}">
    <table style=" text-align: center">
        <tr>
            <td><a>Nombre Pelicula</a></td>
            <td><a>Numero Sala</a></td>
            <td><a>Hora Funcion</a></td>
            <td><a>Sillas Disponibles</a></td>
            <td><a>Formato</a></td> 
        </tr>
        <tr>
            <td><a>${funcion.getPelicula().getNombre()}</a></td>
            <td><a>${funcion.getSala().getNumeroSala()}</a></td>
            <td><a>${funcion.getHoraDeFuncion()}</a></td>
            <td><a>${funcion.getSillasDisponibles()}</a></td>
            <td><a>${funcion.getFormato()}</a></td>

        </tr>
    </table>
</c:if>
<a href="./VerPelicula?pelicula=${pelicula}">Volver</a>
<%@include file="footer.jsp" %>