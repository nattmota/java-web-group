<%-- 
    Document   : produto
    Created on : 15/04/2024, 15:45:11
    Author     : Senai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://kit.fontawesome.com/6f0f753ce6.js" crossorigin="anonymous"></script>
        <link href="style/header.css" rel="stylesheet" type="text/css"/>
        <link href="style/footer.css" rel="stylesheet" type="text/css"/>
        <link href="style/style-produto.css" rel="stylesheet" type="text/css"/>
        <title>Página do Produto</title>
    </head>
    <body>
        <div class="upper-header">
            <div class="icons-upper-header">
                <a href="#insta"><i class="fa-brands fa-instagram"></i></a>
                <a href="#face"><i class="fa-brands fa-facebook"></i></a>
            </div>
            <div class="upper-header-text">
                <p>Edificando vidas através da literatura cristã</p>
            </div>
        </div>
    <header>
        <div class="header-cima">
            <div class="logo">
                <img src="./assets/Logo Site Komunhão.png" alt="logo-livraria">
            </div>
            <div class="input-box">
                <i class="fa-solid fa-magnifying-glass"></i>
                <input type="text" placeholder="O que você está buscando?" >
            </div>

            <nav class="nav-1">         
                <ul>
                    <div class="element-nav-1">
                        <li><i class="fa-regular fa-comments"></i><a href="#">Atendimento</a></li>
                    </div>
                    <div class="element-nav-1">
                        <li><i class="fa-regular fa-user"></i><a href="./login">Minha conta</a></li>
                    </div>
                    <div class="element-nav-1">
                        <li><i class="fa-solid fa-cart-shopping"></i><a href="#">Meu carrinho</a></li>
                    </div>
                </ul>
            </nav>
        </div>
        <hr/>
        <nav class="header-baixo">
            <ul>
                <li><a href="./home">Início</a></li>
                <li><a href="#">Livros <i class="fa-solid fa-chevron-down"></i></a></li>
                <li><a href="#">Papelaria <i class="fa-solid fa-chevron-down"></i></a></li>
                <li><a href="#">Presentes <i class="fa-solid fa-chevron-down"></i></a></li>
                <li><a href="#">Bíblias <i class="fa-solid fa-chevron-down"></i></a></li>
                <li><a href="#">Brinquedos Educativos <i class="fa-solid fa-chevron-down"></i></a></li>
                <li><a href="#">Quem somos</a></li>
                <li><a href="#">Contato</a></li>                
            </ul>
        </nav>
        <br/>
    </header>
    <main>
        <div class="center-text">
            <h1>PRODUTOS</h1>
        </div>
    </main>
    <section class="upper-footer">
        <div class="column-dp">
            <h4>Departamentos</h4>
            <p><a href="#">Início</a></p>
            <p><a href="#">Livros</a></p>
            <p><a href="#">Presentes</a></p>
            <p><a href="#">Bíblias</a></p>
            <p><a href="#">Brinquedos educativos</a></p>
            <p><a href="#">Quem somos</a></p>
            <p><a href="#">Contato</a></p>
        </div>
        <div class="column-empresa">
            <h4>Diretrizes da empresa</h4>
            <p><a href="#">Missão, Visão, Valores</a></p>
            <p><a href="#">Como Comprar</a></p>
            <p><a href="#">Trocas e Devoluções</a></p>
            <p><a href="#">Perguntas Frequentes</a></p>
            <p><a href="#">Política de Privacidade</a></p>
            <p><a href="#">Termos de Uso</a></p>
            <p><a href="#">Política de Reembolso</a></p>
        </div>
        <div class="contato">
            <h4>Entre em contato</h4>
            <a href=""><i class="fa-brands fa-whatsapp">5543999752103</i></a>
            <a href=""><i class="fa-solid fa-phone"></i>4330283484</a>
            <i class="fa-solid fa-envelope">contato@komunhao.com.br</i>
            <i class="fa-solid fa-location-dot">Rua Barão de Loreto, 15 Vila Fujita - Londrina - PR</i>
        </div>
        <div class="sociais">
            <h4>Permaneça conectado</h4>
            <button><a href="#"><i class="fa-brands fa-instagram"></i></a></button>
            <button><a href="#"></a><i class="fa-brands fa-facebook"></i></button>
        </div>
    </section>
    <footer>
        s
    </footer>
    </body>
</html>
