create table PRODUTO(
id int primary key generated always as identity not null
, nome varchar(50) not null
, descricacao varchar (300) not null
, codigo int not null
, preco money not null
);

create table CATEGORIA(
id int primary key generated always as identity not null
, nome varchar(50) not null
, descricacao varchar (300)
);

create table CARRO(
id int primary key generated always as identity not null
, modelo varchar(50) not null
, marca varchar (50)not null
);

alter table CARRO
add column chassi varchar(100) not null;

alter table CARRO
add column ano int not null;

alter table produto
drop column codigo;

drop table carro;

alter table produto 
	add column categoria_id int not null;


alter table produto 
	add constraint fk_categoria foreign key (categoria_id) references categoria(id);



