create table client (  id integer not null,  name varchar(50) not null,  email varchar(120) not null,  constraint pk_client primary key (id) ); 
 
create sequence seq_client; 

insert into client(id, name, email) values (nextval('seq_client'), 'joao', 'joao@email.com');
insert into client(id, name, email) values (nextval('seq_client'), 'maria', 'maria@email.com');
insert into client(id, name, email) values (nextval('seq_client'), 'jose', 'jose@email.com');