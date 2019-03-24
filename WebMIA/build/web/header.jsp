<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <meta charset="utf-8">
        <title>CinemaMelo</title> 
        <link rel="stylesheet" type="text/css" href="css/style.css" />
    </head>
    <body>
        <div id="container">
            <table width="100%">
                <tr>
                    <td style="width : 80% "><h1>CinemaMelo</h1></td>

                    <c:if test="${empty listaPersonas}">
                        <td  style=" width: 20% ; text-align: center">
                            <h4><a href="./Personas"> Log In </a></h4>
                        </td>
                    </c:if>

                    <c:forEach items="${listaPersonas}" var="pro">
                        <c:if test="${pro.getNombre()== null}">
                            <td>
                                <h4><a href="./Personas"> Log In </a></h4>
                            </td>   
                        </c:if>
                        <c:if test="${pro.getNombre()!= null}">
                            <td>
                                <h4><a href="./LogIn"> ${pro.getNombre()} </a></h4>
                            </td>
                        </c:if> 
                    </c:forEach>   
                </tr>
            </table>

            <div id="body">