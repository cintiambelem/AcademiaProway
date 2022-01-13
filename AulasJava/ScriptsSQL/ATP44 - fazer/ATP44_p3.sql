--_  Crie uma tabela país com id(PK), nome e sigla.
--_  Crie uma tabela estado com id(PK), nome, sigla e pais_id(FK);
--_  Crie uma tabela cidade com id(PK), nome e estado_id(FK);
--_  Adicione um país, um estado e uma cidade. Execute os DDL e DML em uma mesma transação 

begin transaction;

create table pais(
	id int primary key generated always as identity
	,nome varchar(50)
	,sigla varchar (4)
	--constraint fk_pais foreign key (pais_id) references pais(id)
);

create table estado(
	id int primary key generated always as identity
	,nome varchar(50)
	,sigla varchar (4)
	,pais_id int
	,constraint fk_pais foreign key (pais_id) references pais(id)	
);

create table cidade(
	id int primary key generated always as identity
	,nome varchar(50)
	,estado_id int
	,constraint fk_estado foreign key (estado_id) references estado(id)
	
);

--insert into pais (nome, sigla) values ('brasil', 'br');
--insert into estado (nome, sigla) values ('rio de janeiro', 'rj');
--insert into cidade (nome) values ('quissamã');

commit;
end;




