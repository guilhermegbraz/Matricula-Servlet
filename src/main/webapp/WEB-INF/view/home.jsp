<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<style><%@include file="/WEB-INF/style/style_padrao.css"%></style>
<c:url value="/UnicaEntradaServlet" var="linkUnicaEntrada"/>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Matricula</title>
    <link rel="stylesheet" type="text/css" href="../style/style_padrao.css">
    <script type="text/javascript" src="menu_lateral.js"></script>
</head>

<body>

    <c:import url="cabecalho.jsp" />

    <main class="principal">
        <div class="main_div">
            <h2>Aplicação para voce salvar a lista de matérias que pretende fazer na graduação</h2>
            <c:if test="${empty usuarioLogado.nomeDeUsuario}">
                <h4>Certifiquesse de estar logado para utilizar a aplicação</h4>
            </c:if>
        </div>

    </main>

</body>
</html>