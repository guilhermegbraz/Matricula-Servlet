<%--
  Created by IntelliJ IDEA.
  User: Guilh
  Date: 15/07/2022
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Matricula</title>
    <link rel="stylesheet" type="text/css" href="style_padrao.css">
</head>


<body>

    <nav class="menu_lateral">
        <ul>
            <li><input class="btn_btn-primary" type="submit" value="home">
        </ul>
    </nav>

    <header class="cabecalho">
        <!--<button class="cabecalho__menu">Menu</button>-->
        <h1 class="cabecalho__titulo" id="titulo_pagina">Matricula Servlet</h1>
        <h1> </h1>

    </header>

    <main>

        <div class="main_div">
            <ul>
                <c:forEach items="${ disciplinas }" var="disciplina">
                    <li><h3>${ disciplina.nomeDisciplina }</h3></li>
                </c:forEach>
            </ul>
        </div>
    </main>
</body>
</html>
