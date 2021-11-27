create database db_ecommerce;
use db_ecommerce;

create table tb_produtos(
id bigint auto_increment unique,
nome varchar(200),
marca varchar(200),
categoria int,
preco decimal(7,2)
);

insert into tb_produtos (nome, marca, categoria, preco) values ("Corinthians I 2020/21", "Nike", "Camisa", 250.00);
insert into tb_produtos (nome, marca, categoria, preco) values ("Air Max 97", "Nike", "Tênis", 709.00);
insert into tb_produtos (nome, marca, categoria, preco) values ("OZWEEGO", "Adidas", "Tênis", 599.00);
insert into tb_produtos (nome, marca, categoria, preco) values ("Penny", "Oakley", "Óculos", 600.00);
insert into tb_produtos (nome, marca, categoria, preco) values ("Iconic T7", "Puma", "Jaqueta Corta Vento", 149.00);
insert into tb_produtos (nome, marca, categoria, preco) values ("12 Mola", "Nike", "Tênis", 800.00);
insert into tb_produtos (nome, marca, categoria, preco) values ("Radar Lock", "Oakley", "Óculos", 700.00);
insert into tb_produtos (nome, marca, categoria, preco) values ("Seleção Brasil III 2019/20", "Nike", "Camisa", 300.00);

select * from tb_produtos;
select * from tb_produtos where preco < 500;
select * from tb_produtos where preco > 500;

update tb_produtos set nome= "Oakley" where id= 1;




