-- Liste todos os dados de todas as colunas da tabela Categoria.
select * from categoria c ;

-- Liste todos os dados de todas as colunas da tabela Produto.
select * from produto p 



-- Liste os dados de todas as colunas da tabela Categoria, para as linhas que possuam uma descrição preenchida.

select * from categoria
where descricao !='';


-- Liste os dados das colunas Id, nome e preço da tabela Produto, para as linhas que possuem um nome iniciando com C.
insert into produto (nome, preco, descricao, categoria_id) values ('cafeteira', 199.90, 'cafeteira eletrica', 1);
select id, nome, preco from produto
where nome like 'c%';


--_  Para os próximos exercícios, caso necessário, utilize o JOIN para unir as duas tabelas.
--_  Liste os dados das colunas Id, nome e preço da tabela Produto e os dados id, nome e descrição da tabela Categoria para as linhas que possuem um preço maior que 0.

insert into produto (nome, descricao, preco, categoria_id) values('notebook c88', 'notebook lindão', 0, 3);

select p.id as "ProdutoId"
, p.nome
, p.preco
,c.id as "CategoriaID"
, c.nome
, c.descricao 
from produto p 
join categoria as c 
on p.categoria_id = c.id
where p.preco > (money(0));

--_  Liste os dados de todas as colunas da tabela Produto que possuem categoria com Id maior que 2.
select id, nome, preco, descricao, categoria_id from produto where id >2;

--_  Liste os dados de todas as colunas da tabela Categoria e o os dados da coluna nome da tabela Produto, para as categorias que estão sendo utilizadas por produtos.
select p.id as "ProdutoId"
, p.nome
, p.preco
, c.id as "CategoriaID"
, c.nome
, c.descricao 
from produto p 
join categoria as c 
on p.categoria_id = c.id; 

SELECT id, nome, descricao FROM categoria;











