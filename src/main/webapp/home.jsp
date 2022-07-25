<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/UnicaEntradaServlet" var="linkUnicaEntrada"/>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Matricula</title>
    <link rel="stylesheet" type="text/css" href="style_padrao.css">
    <script type="text/javascript" src="menu_lateral.js"></script>
</head>

<body>

    <!--<nav class="menu_horizontal">
        <ul>
            <li><a href="/Matricula_Servlet_war_exploded/"><input class="links" type="button" value="home" ></a></li>

            <li><a href="/Matricula_Servlet_war_exploded/NovaDisciplinaServlet">
                <input class="links" type="button" value="Cadastrar nova disciplina" ></a></li>

            <li><a href="/Matricula_Servlet_war_exploded/DisciplinaCadastradaServlet">
                <input class="links" type="button" value="Listar disciplinas" ></a></li>
        </ul>
    </nav>-->

    <header class="cabecalho">
        <!--<button class="cabecalho__menu" onclick="menu()">Menu</button>-->
        <div class="titulo_pagina">
        <h1 class="cabecalho__titulo" id="titulo_pagina">Matricula Servlet</h1>
        </div>

        <nav class="menu_horizontal">
            <a href="${ linkUnicaEntrada }?acao=Home"><input class="links" type="button" value="home" ></a>

            <a href="${ linkUnicaEntrada}?acao=NovaDisciplina">
                <input class="links" type="button" value="Cadastrar nova disciplina" ></a>

            <a href="${ linkUnicaEntrada }?acao=ListarDisciplinas">
                <input class="links" type="button" value="Listar disciplinas" ></a>

        </nav>
    </header>

    <main class="principal">
        <div class="main_div">
            <h2>Aplicação para voce salvar a lista de matérias que pretende fazer na graduação</h2>
        </div>

        <div class="botoes_link">
            <a href="${ linkNovaDisciplina}">
                <input type="button" value="Cadastrar disciplina" class="links"></a>

            <a href="${ linkListarDisciplina }">
                <input type="button" value="Ver disciplinas cadastradas" class="links"></a>
        </div>
    </main>

</body>
</html>