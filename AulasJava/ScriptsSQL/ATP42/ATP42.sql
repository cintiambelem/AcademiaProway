--_  Insira 3 categorias na tabela categoria.
insert into categoria (nome, descricao) values ('eletrodoméstico', 'equipamentos para domicilio');
insert into categoria (nome, descricao) values ('informática', 'equipamentos de TI');
insert into categoria (nome, descricao) values ('refrigeração', 'equipamentos de refrigeração residencial');

--_  Insira 6 produtos na tabela produto.
insert into produto (nome, descricao, preco, categoria_id) values ('maquina de lavar lg b675', 'lavadora de roupas de ultima geração', 1050.87,1);
insert into produto (nome, descricao, preco, categoria_id) values ('fogao brastemp', 'fogao 876s', 699.89,1);
insert into produto (nome, descricao, preco, categoria_id) values ('notebook dell 5874', 'laptop dell', 8999.99,2);
insert into produto (nome, descricao, preco, categoria_id) values ('notebook lenovo 5874', 'laptop lenovo', 7900.99,2);
insert into produto (nome, descricao, preco, categoria_id) values ('ar condicionado springer','G57982', 5599.99,3);
insert into produto (nome, descricao, preco, categoria_id) values ('ventilador samsungr','J2312', 799.99,3);

--_  Altere a descrição de dois produtos.
update produto
set
descricao = 'alteração 1'
where id = 3;

update produto
set
descricao = 'alteração 2'
where id = 2;

--_  Delete um produto e uma categoria. 
delete from produto 
where categoria_id = 2;

delete from categoria 
where id = 2;

--_  Altere uma categoria de um produto.
update produto 
set categoria_id = 3
where id = 4;

-- _  Altere o preço de todos os produtos tirando R$1,00 do preço atual.

update produto set preco = (preco - money(1.0));













	