<%@ page import="java.util.ArrayList, com.cintiabelem.atp56.models.CategoriaModel" %>

<%
    ArrayList<CategoriaModel> categorias = (ArrayList<CategoriaModel>)request.getAttribute("categorias");
%>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Categoria-Lista</title>
    <link rel="stylesheet" href="../css/styles.css">
</head>
<body>
    <h1>Lista de categorias</h1>
    <form action="/atp58-1/categoria/listar" method="get">
        Nome:<input type="text" name="nome" id="nome">
        <input type="submit" value="Filtrar">
    </form>
    <table>
        <thead>
            <tr>
                <th>Id</th>
                <th>Nome</th>
                <th>Descricao</th>
            </tr>
        </thead>
        <tbody>
            <% for (CategoriaModel model : categorias) { %>
                <tr>
                    <td><%= model.getId_categoria() %></td>
                    <td><%= model.getNome() %></td>
                    <td><%= model.getDescricao() %></td>
                    
                </tr>
            <%}%>
        </tbody>
    </table>
</body>
</html>