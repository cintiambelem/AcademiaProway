<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Produto cadastro</title>
    <link rel="stylesheet" href="css/styles.css">
</head>

<body>
    <h1>Cadastro produto</h1>
    <form action="/atp57-1/produto" method="post">
    nome: <input type="text" name="nome" id="nome"> <br />
    valor: <input type="number" name="valor" id="valor" min="0.00" max="10000.00"> <br />
    id_categoria: <input type="number" name="id_categoria" id="id_categoria"> <br />
    <input type="submit" value="Salvar">
    </form>

</body>

</html>