create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

create table tb_categoria(
id bigint auto_increment,
categoria varchar(200),
primary key (id)
);

create table tb_produto (
id bigint auto_increment,
marca varchar (255) not null,
preco decimal(6,2) not null,
disp_estoque boolean,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert into tb_categoria(categoria) values ("Tinta");
insert into tb_categoria(categoria) values ("Cimento");
insert into tb_categoria(categoria) values ("Argamassa");
insert into tb_categoria(categoria) values ("Materiais hidraulicos");
insert into tb_categoria(categoria) values ("Materiais eletricos");

insert into tb_produto(marca,preco,disp_estoque,categoria_id) values ("Suvinil", 20,true,1);
insert into tb_produto(marca,preco,disp_estoque,categoria_id) values ("Ecomix", 10,true,3);
insert into tb_produto(marca,preco,disp_estoque,categoria_id) values ("Docol",80,false,4);
insert into tb_produto(marca,preco,disp_estoque,categoria_id) values ("Coral", 400,true,1);
insert into tb_produto(marca,preco,disp_estoque,categoria_id) values ("Quartzolit",130,false,1);
insert into tb_produto(marca,preco,disp_estoque,categoria_id) values ("Golden",50,false,5);
insert into tb_produto(marca,preco,disp_estoque,categoria_id) values ("Votoran",30,true,2);
insert into tb_produto(marca,preco,disp_estoque,categoria_id) values ("Sil",200,true,5);

select * from tb_produto where preco>50;


select * from tb_produto where preco > 3 and  preco < 60;

select * from tb_produto where marca like "c%" or "C%";

select tb_produto.id,tb_produto.marca,tb_produto.preco,tb_produto.disp_estoque,tb_categoria.categoria
 from tb_produto inner join tb_categoria 
 on tb_produto.categoria_id=tb_categoria.id;
 
 select tb_produto.id,tb_produto.marca,tb_produto.preco,tb_produto.disp_estoque,tb_categoria.categoria
 from tb_produto inner join tb_categoria 
 on tb_produto.categoria_id=tb_categoria.id where tb_categoria.id=4;
 