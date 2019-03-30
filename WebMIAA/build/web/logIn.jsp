<%@include file="header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<form method="POST" action="./LogIn">
    Correo Electronico: <input type="email" name="correo" required /><br /><br />
    Clave: <input type="password" name="clave" required/><br /><br />
    <input type="submit" value="Ingresar" />
</form>
<c:if test="${aPersona != null}">
    ENTRO EN aPERSONA dif NULL
</c:if>
<c:if test="${aPersona == null}">
    no Existen PErsonas
</c:if>
<%@include file="footer.jsp" %>
