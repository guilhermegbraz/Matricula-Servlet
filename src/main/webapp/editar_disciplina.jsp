<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<c:url value="/UnicaEntradaServlet" var="linkUnicaEntrada"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Adicionar disciplina</title>
    <link rel="stylesheet" type="text/css" href="style_padrao.css">
</head>
<body>
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

<main>
    <form action="${ linkUnicaEntrada }" method="post">
        <label for="entrada_disciplina">Nome da disciplina:</label>
        <input type="text" name="nomeDisciplina" id="entrada_disciplina" required value="${disciplina.nomeDisciplina}">

        <label for="entrada_TPI">TPI da disciplina:</label>
        <input type="text" name="TPIDisciplina" id="entrada_TPI" required value="${disciplina.TPI}">

        <label for="entrada_professor">Nome do professor ofertando a disciplina (opcional):</label>
        <input type="text" name="professorDisciplina" id="entrada_professor" value="${disciplina.professor}">


        <input type="text" name="idDisciplina" id="id_disciplina" value="${disciplina.id}" hidden >

        <input type="text" name="acao" value="AlterarDisciplina" hidden>

        <input type="submit" class="botao_submeter">
    </form>
</main>
</body>
</html>