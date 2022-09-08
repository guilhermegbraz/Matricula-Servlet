<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/UnicaEntradaServlet" var="linkUnicaEntrada"/>
<style><%@include file="/WEB-INF/style/style_padrao.css"%></style>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Adicionar disciplina</title>
    <link rel="stylesheet" type="text/css" href="style_padrao.css">
</head>
<body>

    <c:import url="cabecalho.jsp" />
    <main>
        <form  action="${ linkUnicaEntrada }" method="post">
            <label for="entrada_login">E-mail:</label>
            <input class="login" type="text" name="email" id="entrada_login" required>

            <label for="entrada_senha">Senha:</label>
            <input class="login" type="password" name="senha" id="entrada_senha" required>

            <input type="text" name="acao" value="Login" hidden>

            <input type="submit" class="botao_submeter">
        </form>
    </main>
</body>
</html>