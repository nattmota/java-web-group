<%-- 
    Document   : ivros
    Created on : 12/04/2024, 14:47:09
    Author     : Senai
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style/style-tabelaLivros.css" rel="stylesheet" type="text/css"/>
        <title>Tabela Livros</title>
    </head>
    <body>
        <div class="center-table">
            <div class="center-element">
                <h1>Lista de livros</h1>
            </div>
            <c:forEach items="${livros}" var="livro"> 
                <div id="${livro.idLivro}">
                    <table>
                <tr>
                    <th>ID</th>
                    <th>Título</th>
                    <th>Autor</th>
                    <th>Preço</th>
                </tr>
                <tr>
                    <td>${livro.idLivro}</td>
                    <td>${livro.titulo}</td>
                    <td>${livro.autor}</td>
                    <td>${livro.preco}</td>
                </tr>
            </table>
                <br></br>
                </div>            
            </c:forEach>
        </div>
    </body>
</html>
