create database banco_komunhao;
use banco_komunhao;
drop database banco_komunhao;

create table usuario (
    idUsuario int primary key auto_increment,
    nome varchar(100) not null,
    email varchar(100) not null,
    senha varchar(100) not null,
    cpf char(11) not null,
    telefone varchar(13)
);

create table endereco (
    idEndereco int primary key auto_increment,
    estado varchar(50) not null,
    cidade varchar(50) not null,
    cep char(9),
    rua varchar(100) not null,
    numero varchar(10) not null,
    complemento varchar(100)
);

create table categoria (
    idCategoria int primary key auto_increment,
    nome varchar(100) not null
);

create table produto (
    idProduto int primary key auto_increment,
    nome varchar(100) not null,
    autor varchar(100) not null,
    valor float(10,2) not null,
    imagem longblob,
    categoria int,
    foreign key (categoria) references categoria(idCategoria)
);



create table estoque (
    idEstoque int primary key auto_increment,
    produto int not null,
    quantidade int not null,
    custo float(10,2) not null,
    foreign key (produto) references produto(idProduto)
);

create table pedido (
    idPedido int primary key auto_increment,
    usuario int not null,
    endereco_entrega int not null,
    data_pedido date not null,
    valorTotal float,
    foreign key (endereco_entrega) references endereco(idEndereco),
    foreign key (usuario) references usuario(idUsuario)
);

create table carrinho (
	idCarrinho int primary key auto_increment,
    usuario int,
    foreign key (usuario) references usuario(idUsuario)
);

create table carrinho_produto (
    idCarrinho_produto int primary key auto_increment,
    carrinho int not null,
    produto int not null,
    foreign key (carrinho) references carrinho(idCarrinho),
    foreign key (produto) references produto(idProduto)
);

create table produto_pedido (
	idProduto_pedido int primary key auto_increment,
    pedido int not null,
    produto int not null,
    foreign key (pedido) references pedido(idPedido),
    foreign key (produto) references produto(idProduto)
);

-- INSERT CATEGORIAS
INSERT INTO categoria (nome)
VALUES ('Evangélicos');

-- INSERT USUARIOS
INSERT INTO usuario (nome,email,senha,cpf,telefone)
VALUES ('admin','admin','admin','082','4399');


-- INSERT PRODUTOS
-- Insert 1
INSERT INTO produto (nome, autor, valor, categoria)
VALUES ('O Evangelho Segundo Jesus Cristo', 'José Saramago', 25.99, 1);

-- Insert 2
INSERT INTO produto (nome, autor, valor, categoria)
VALUES ('Mere Christianity', 'C.S. Lewis', 15.50, 1);

-- Insert 3
INSERT INTO produto (nome, autor, valor, categoria)
VALUES ('The Purpose Driven Life', 'Rick Warren', 20.75, 1);

-- Insert 4
INSERT INTO produto (nome, autor, valor, categoria)
VALUES ('O Peregrino', 'John Bunyan', 18.99, 1);

-- Insert 5
INSERT INTO produto (nome, autor, valor, categoria)
VALUES ('Cristianismo Puro e Simples', 'C.S. Lewis', 16.25, 1);

-- Insert 6
INSERT INTO produto (nome, autor, valor, categoria)
VALUES ('O Código Da Vinci', 'Dan Brown', 22.99, 1);

-- Insert 7
INSERT INTO produto (nome, autor, valor, categoria)
VALUES ('O Exorcista', 'William Peter Blatty', 19.75, 1);

-- Insert 8
INSERT INTO produto (nome, autor, valor, categoria)
VALUES ('De Volta à Cabana', 'William P. Young', 18.50, 1);

-- Insert 9
INSERT INTO produto (nome, autor, valor, categoria)
VALUES ('Deixados para Trás', 'Tim LaHaye, Jerry B. Jenkins', 24.99, 1);

-- Insert 10
INSERT INTO produto (nome, autor, valor, categoria)
VALUES ('A Bíblia Sagrada', 'Diversos Autores', 30.00, 1);

-- Insert 11
INSERT INTO produto (nome, autor, valor, categoria) 
VALUES ('Mereça Ser Feliz', 'Pastor Claudio Duarte', 19.99, 1);

-- Insert 12
INSERT INTO produto (nome, autor, valor, categoria) 
VALUES ('O Poder da Oração Transformadora', 'Stormie Omartian', 29.99, 1);

-- Insert 13
INSERT INTO produto (nome, autor, valor, categoria) 
VALUES ('Oração: A Chave do Avivamento', 'Josué Gonçalves', 22.50, 1);

-- Insert 14
INSERT INTO produto (nome, autor, valor, categoria) 
VALUES ('A Batalha da Fé', 'Kenneth Hagin', 17.99, 1);

-- Insert 15
INSERT INTO produto (nome, autor, valor, categoria) 
VALUES ('A Mulher V', 'Pastor Hernandes Dias Lopes', 27.50, 1);

-- Insert 16
INSERT INTO produto (nome, autor, valor, categoria) 
VALUES ('Bênçãos do Quebrantamento', 'Nancy Leigh DeMoss', 24.99, 1);

-- Insert 17
INSERT INTO produto (nome, autor, valor, categoria) 
VALUES ('Fala Sério, Mãe!', 'Thalita Rebouças', 14.99, 1);

-- Insert 18
INSERT INTO produto (nome, autor, valor, categoria) 
VALUES ('Uma Mulher Sábia', 'Dee Brestin', 21.99, 1);

-- Insert 19
INSERT INTO produto (nome, autor, valor, categoria) 
VALUES ('A Batalha da Mente', 'Joyce Meyer', 23.50, 1);
