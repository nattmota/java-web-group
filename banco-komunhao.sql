create database banco_komunhao;
use banco_komunhao;
-- drop database banco_komunhao;

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
    autor varchar(100),
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
VALUES ('Livros'),('Papelaria'),('Bíblias'),('Brinquedos Educativos');

-- INSERT USUARIOS
INSERT INTO usuario (nome,email,senha,cpf,telefone)
VALUES ('admin','admin','admin','082','4399');


-- INSERT PRODUTOS - Categoria 1 (LIVROS)

INSERT INTO produto (nome, autor, valor, categoria)
VALUES ('O Evangelho Segundo Jesus Cristo', 'José Saramago', 25.99, 1);
INSERT INTO produto (nome, autor, valor, categoria)
VALUES ('Mere Christianity', 'C.S. Lewis', 15.50, 1);
INSERT INTO produto (nome, autor, valor, categoria)
VALUES ('The Purpose Driven Life', 'Rick Warren', 20.75, 1);
INSERT INTO produto (nome, autor, valor, categoria)
VALUES ('O Peregrino', 'John Bunyan', 18.99, 1);
INSERT INTO produto (nome, autor, valor, categoria)
VALUES ('Cristianismo Puro e Simples', 'C.S. Lewis', 16.25, 1);
INSERT INTO produto (nome, autor, valor, categoria)
VALUES ('O Código Da Vinci', 'Dan Brown', 22.99, 1);
INSERT INTO produto (nome, autor, valor, categoria)
VALUES ('O Exorcista', 'William Peter Blatty', 19.75, 1);
INSERT INTO produto (nome, autor, valor, categoria)
VALUES ('De Volta à Cabana', 'William P. Young', 18.50, 1);
INSERT INTO produto (nome, autor, valor, categoria)
VALUES ('Deixados para Trás', 'Tim LaHaye, Jerry B. Jenkins', 24.99, 1);
INSERT INTO produto (nome, autor, valor, categoria) 
VALUES ('Mereça Ser Feliz', 'Pastor Claudio Duarte', 19.99, 1);
INSERT INTO produto (nome, autor, valor, categoria) 
VALUES ('O Poder da Oração Transformadora', 'Stormie Omartian', 29.99, 1);
INSERT INTO produto (nome, autor, valor, categoria) 
VALUES ('Oração: A Chave do Avivamento', 'Josué Gonçalves', 22.50, 1);
INSERT INTO produto (nome, autor, valor, categoria) 
VALUES ('A Batalha da Fé', 'Kenneth Hagin', 17.99, 1);
INSERT INTO produto (nome, autor, valor, categoria) 
VALUES ('A Mulher V', 'Pastor Hernandes Dias Lopes', 27.50, 1);
INSERT INTO produto (nome, autor, valor, categoria) 
VALUES ('Bênçãos do Quebrantamento', 'Nancy Leigh DeMoss', 24.99, 1);
INSERT INTO produto (nome, autor, valor, categoria) 
VALUES ('Fala Sério, Mãe!', 'Thalita Rebouças', 14.99, 1);
INSERT INTO produto (nome, autor, valor, categoria) 
VALUES ('Uma Mulher Sábia', 'Dee Brestin', 21.99, 1);
INSERT INTO produto (nome, autor, valor, categoria) 
VALUES ('A Batalha da Mente', 'Joyce Meyer', 23.50, 1);

-- INSERT PRODUTOS - Categoria 2 (Papelaria)

INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Caneta Esferográfica', NULL, 2.50, 2);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Bloco de Notas', NULL, 5.99, 2);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Lápis de Cor', NULL, 8.50, 2);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Borracha', NULL, 1.20, 2);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Caderno Universitário', NULL, 12.99, 2);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Régua', NULL, 1.99, 2);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Apontador', NULL, 1.00, 2);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Marcador de Texto', NULL, 3.75, 2);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Pasta Suspensa', NULL, 6.49, 2);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Cola Bastão', NULL, 2.20, 2);

-- INSERT PRODUTOS - Categoria 3 (Biblias)

INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Bíblia Sagrada - Nova Tradução na Linguagem de Hoje (NTLH)', NULL, 19.99, 3);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Bíblia de Estudo Almeida Revista e Atualizada (ARA)', NULL, 49.99, 3);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Bíblia de Estudo Pentecostal (BEPA)', NULL, 59.99, 3);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Bíblia de Estudo Plenitude (BEP)', NULL, 54.99, 3);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Bíblia de Estudo Aplicação Pessoal (APL)', NULL, 44.99, 3);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Bíblia de Estudo Genebra', NULL, 64.99, 3);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Bíblia King James Atualizada (KJA)', NULL, 29.99, 3);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Bíblia de Estudo da Mulher Cristã', NULL, 39.99, 3);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Bíblia de Estudo NVI', NULL, 49.99, 3);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Bíblia Thompson (BT)', NULL, 44.99, 3);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Bíblia do Guerreiro da Luz', NULL, 34.99, 3);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Bíblia Sagrada - Versão Digital', NULL, 14.99, 3);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Bíblia de Estudo Palavras-Chave', NULL, 49.99, 3);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Bíblia de Estudo Despertar', NULL, 54.99, 3);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Bíblia de Estudo Defesa da Fé', NULL, 59.99, 3);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Bíblia de Estudo Arqueológica', NULL, 69.99, 3);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Bíblia de Estudo Profética', NULL, 54.99, 3);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Bíblia de Estudo da Liderança Cristã', NULL, 49.99, 3);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Bíblia do Pregador Pentecostal', NULL, 59.99, 3);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Bíblia de Estudo Facilitado (BEF)', NULL, 39.99, 3);

-- INSERT PRODUTOS - Categoria 4 (Brinquedos Educativos)

INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Quebra-Cabeça Bíblico', NULL, 19.99, 4);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Jogo da Memória Bíblico', NULL, 14.99, 4);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Kit de Colorir com Temas Bíblicos', NULL, 9.99, 4);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Quebra-Cabeça de Histórias da Bíblia', NULL, 22.50, 4);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Livro de Atividades Bíblicas para Crianças', NULL, 12.99, 4);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Jogo Interativo de Perguntas Bíblicas', NULL, 24.99, 4);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Kit de Construção de Arca de Noé', NULL, 29.99, 4);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Bonecos de Pelúcia de Personagens Bíblicos', NULL, 17.99, 4);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Livro de Histórias Bíblicas Interativo', NULL, 18.99, 4);
INSERT INTO produto (nome, autor, valor, categoria) VALUES ('Puzzle da Criação', NULL, 15.50, 4);

