<%--
  Created by IntelliJ IDEA.
  User: Guilh
  Date: 15/07/2022
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/" var="linkHome"/>
<c:url value="/NovaDisciplinaServlet" var="linkNovaDisciplina"/>
<c:url value="/DisciplinaCadastradaServlet" var="linkListarDisciplina"/>
<c:url value="/RemoveDisciplinaServlet" var="linkRemoveDisciplina"/>
<c:url value="/ExibeDisciplinaServlet" var="linkExibeDisciplina"/>

<html>
<head>
    <meta charset="UTF-8">
    <title>Matricula</title>
    <link rel="stylesheet" type="text/css" href="style_padrao.css">
</head>


<body>

<header class="cabecalho">
    <!--<button class="cabecalho__menu" onclick="menu()">Menu</button>-->
    <div class="titulo_pagina">
        <h1 class="cabecalho__titulo" id="titulo_pagina">Matricula Servlet</h1>
    </div>

    <nav class="menu_horizontal">
        <a href="${ linkHome }"><input class="links" type="button" value="home" ></a>

        <a href="${ linkNovaDisciplina}">
            <input class="links" type="button" value="Cadastrar nova disciplina" ></a>

        <a href="${ linkListarDisciplina }">
            <input class="links" type="button" value="Listar disciplinas" ></a>

    </nav>
</header>

    <main>

        <c:if test="${not empty disciplinas}">
        <div class="main_div">
            <ul class="lista_disciplinas">
                <c:forEach items="${ disciplinas }" var="disciplina">
                    <li>
                        <h2>Disciplina: ${ disciplina.nomeDisciplina },
                            TPI: ${disciplina.TPI},
                            Professor: ${disciplina.professor}</h2>
                        <a href="${linkRemoveDisciplina}?id=${disciplina.id}">remover</a>
                        <a href="${linkExibeDisciplina}?id=${disciplina.id}">editar</a>
                    </li>
                </c:forEach>
            </ul>
        </div>
        </c:if>

        <c:if test="${ empty disciplinas}">
            <h3>Nenhuma disciplina cadastrada</h3>
        </c:if>
    </main>
</body>
</html>
