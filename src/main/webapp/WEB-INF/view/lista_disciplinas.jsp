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

<html>
<head>
    <meta charset="UTF-8">
    <title>Matricula</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style_padrao.css" />
</head>


<body>

<c:import url="cabecalho.jsp" />

    <main>

        <c:if test="${not empty disciplinas}">
        <div class="main_div">
            <ul class="lista_disciplinas">
                <c:forEach items="${ disciplinas }" var="disciplina">
                    <li>
                        <h2>Disciplina: ${ disciplina.nomeDisciplina },
                            TPI: ${disciplina.TPI},
                            Professor: ${disciplina.professor}</h2>
                        <a href="${linkUnicaEntrada}?acao=RemoverDisciplina&id=${disciplina.id}">remover</a>
                        <a href="${linkUnicaEntrada}?acao=EditarDisciplina&id=${disciplina.id}">editar</a>
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
