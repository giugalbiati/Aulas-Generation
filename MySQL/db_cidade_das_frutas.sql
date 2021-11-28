create database db_cidade_das_frutas;
use db_cidade_das_frutas;
create table tb_categorias(
id bigint auto_increment,
categoria varchar (200),
primary key (id)
);
insert into tb_categorias (categoria) value ("Frutas");
insert into tb_categorias (categoria) value ("Verduras");
insert into tb_categorias (categoria) value ("Legumes");
insert into tb_categorias (categoria) value ("Outros");

create table tb_produtos(
id bigint auto_increment,
nome varchar(200),
preco decimal (10,2),
quantidade bigint,
disponibilidade_estoque boolean,
categoria_id bigint,
primary key(id),
foreign key (categoria_id) references tb_categorias(id)
);
insert into tb_produtos (nome,preco,quantidade,disponibilidade_estoque,categoria_id) value ("Goiaba",5.00,20,true,1);
insert into tb_produtos (nome,preco,quantidade,disponibilidade_estoque,categoria_id) value ("Banana",4.00,5,true,1);
insert into tb_produtos (nome,preco,quantidade,disponibilidade_estoque,categoria_id) value ("Couve",3.50,0,false,2);
insert into tb_produtos (nome,preco,quantidade,disponibilidade_estoque,categoria_id) value ("Milho",8.99,7,true,3);
insert into tb_produtos (nome,preco,quantidade,disponibilidade_estoque,categoria_id) value ("Mandioca",4.00,0,false,3);
insert into tb_produtos (nome,preco,quantidade,disponibilidade_estoque,categoria_id) value ("Açaí",10.00,12,true,4);
insert into tb_produtos (nome,preco,quantidade,disponibilidade_estoque,categoria_id) value ("Palmito",8.00,6,true,4);
insert into tb_produtos (nome,preco,quantidade,disponibilidade_estoque,categoria_id) value ("Amora",6.50,0,false,1);

select*from tb_produtos;
select*from tb_produtos where preco>50.00;
select*from tb_produtos where preco between 3 and 60.00;
select*from tb_categorias where produto like "%c%";

select tb_categorias.categoria, 
tb_produtos.nome,tb_produtos.preco,tb_produtos.quantidade,tb_produtos.disponibilidade_estoque,tb_produtos.categoria_id
from tb_categorias inner join tb_produtos on tb_categorias.id = tb_produtos.categoria_id;

select tb_categorias.categoria, 
tb_produtos.nome,tb_produtos.preco,tb_produtos.quantidade,tb_produtos.disponibilidade_estoque,tb_produtos.categoria_id
from tb_categorias inner join tb_produtos on tb_categorias.id = tb_produtos.categoria_id
where categoria_id = 1 or categoria_id = 2;