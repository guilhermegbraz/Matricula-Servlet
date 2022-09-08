<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<style><%@include file="/WEB-INF/style/style_padrao.css"%></style>


<c:url value="/UnicaEntradaServlet" var="linkUnicaEntrada"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Adicionar disciplina</title>
    <link rel="stylesheet" type="text/css" href="style_padrao.css">
</head>
<body>

    <c:import url="cabecalho.jsp" />

    <main>
        <form action="${ linkUnicaEntrada }" method="post">
            <label for="entrada_disciplina">Nome da disciplina:</label>
            <input type="text" name="nomeDisciplina" id="entrada_disciplina" required>

            <label for="entrada_TPI">TPI da disciplina:</label>
            <input type="text" name="TPIDisciplina" id="entrada_TPI" required>

            <label for="entrada_professor">Nome do professor ofertando a disciplina (opcional):</label>
            <input type="text" name="professorDisciplina" id="entrada_professor" required>

            <input type="text" name="acao" value="NovaDisciplina" hidden>

            <input type="submit" class="botao_submeter">
        </form>
    </main>
</body>
</html>