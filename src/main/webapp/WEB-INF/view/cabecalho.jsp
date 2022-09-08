<%--
  Created by IntelliJ IDEA.
  User: Guilh
  Date: 15/07/2022
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/UnicaEntradaServlet" var="linkUnicaEntrada"/>
<style><%@include file="/WEB-INF/style/style_padrao.css"%></style>


<header class="cabecalho">
    <!--<button class="cabecalho__menu" onclick="menu()">Menu</button>-->
    <div class="titulo_pagina">
        <h1 class="cabecalho__titulo" id="titulo_pagina">Matricula Servlet</h1>
    </div>

    <nav class="menu_horizontal">
        <a href="${ linkUnicaEntrada }?acao=Home"><input class="links" type="button" value="home" ></a>

        <a href="${ linkUnicaEntrada }?acao=NovaDisciplinaForm">
            <input class="links" type="button" value="Cadastrar nova disciplina" ></a>

        <a href="${ linkUnicaEntrada }?acao=ListarDisciplinas">
            <input class="links" type="button" value="Listar disciplinas" ></a>

        <c:if test="${ not empty usuarioLogado.nomeDeUsuario}">
            <a href="${ linkUnicaEntrada }?acao=Logout">
                <input class="links" type="button" value="Logout" ></a>
        </c:if>
    </nav>
</header>

<main>
    <h3>Usuario logado: ${usuarioLogado.nomeDeUsuario}</h3>
</main>
