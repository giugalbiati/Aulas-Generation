create database db_escola;
use db_escola;

create table tb_alunos(
id bigint auto_increment,
nome varchar(200),
turma int,
nota decimal(7,2),
primary key (id)
);

insert into tb_alunos (nome, turma, nota) values ("Damon","1",8.90);
insert into tb_alunos (nome, turma, nota) values ("Elena","1",10.00);
insert into tb_alunos (nome, turma, nota) values ("Stefan","2",6.00);
insert into tb_alunos (nome, turma, nota) values ("Caroline","1",7.00);
insert into tb_alunos (nome, turma, nota) values ("Bonnie","3",7.50);
insert into tb_alunos (nome, turma, nota) values ("Jeremy","3",3.00);

select * from tb_alunos;
select * from tb_alunos where nota < 7.00;
select * from tb_alunos where nota > 7.00;

update tb_alunos set nota = 10.00 where id = 2;
update tb_alunos set nota = 5.50 where id = 6;




