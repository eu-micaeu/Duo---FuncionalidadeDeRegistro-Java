-- Criação da tabela.
CREATE TABLE users (
	id_user serial,
	nickname varchar(100),
	password_user varchar(100),
	primary key(id_user, nickname)
)

-- Inserção de dados de forma manual.
insert into users(nickname, password_user) values ('controll13', 'oswaldao321');
insert into users(nickname, password_user) values ('bom123', 'ophagt542');
insert into users(nickname, password_user) values ('AeThnnHJ', 'ondryas333');

-- Visualização da tabela.
select * from users;

