<%
    int id = (int)request.getAttribute("id");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sucesso</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <h1>Sucesso</h1>
    <h4>Categoria de id <%= id %> cadastrada com sucesso</h4>
    <a href="/atp58-1/categoria/listar"> Listagem</a>
    
</body>
</html>