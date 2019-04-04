<%@include file="header.jsp" %>
<table>
    <tr>
        <td>
            <h3>Persona que utilizo mas dinero en el cine :</h3>
        </td>
        <td>
            <h1> ${MayorD.getNombre()} con una cantidad de ${MayorD.getDineroUtilizado()} dinero utilizado.</h1>
        </td>
    </tr>
    <tr>
        <td>
            <h3>Ultima persona en reservar asientos :</h3>
        </td>
        <td>
            <h1> ${factura.getComprador()} con la factura numero ${factura.getId()} con una cantidad de ${factura.getPrecio()} dinero utilizado.</h1>
        </td>
    </tr>

</table>
<%@include file="footer.jsp" %>