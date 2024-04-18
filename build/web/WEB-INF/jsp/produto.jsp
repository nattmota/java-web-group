<%-- 
    Document   : produto
    Created on : 15/04/2024, 15:45:11
    Author     : Senai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://kit.fontawesome.com/6f0f753ce6.js" crossorigin="anonymous"></script>     
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <link href="./style/style-produto.css" rel="stylesheet" type="text/css"/>
        <link href="./style/header.css" rel="stylesheet" type="text/css"/>
        <link href="./style/footer.css" rel="stylesheet" type="text/css"/>       
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
                <a href="./home"><img src="./assets/Logo Site Komunhão.png" alt="logo-livraria"></a>
            </div>
            <div class="input-box">
                <i class="fa-solid fa-magnifying-glass"></i>
                <input type="text" placeholder="O que você está buscando?" >
            </div>

            <nav class="nav-1">         
                    <ul>
                        <div class="element-nav-1">
                            <li><i class="fa-regular fa-comments"></i><a href="./login">Login</a></li>
                        </div>
                        <div class="element-nav-1">
                            <li><i class="fa-regular fa-user"></i><a href="#">Minha conta</a></li>
                        </div>
                        <div class="element-nav-1">
                            <li><i class="fa-solid fa-cart-shopping"></i><a href="#">Meu carrinho</a></li>
                        </div>
                        <div class="element-nav-1">
                            <li><i class="fa-solid fa-right-from-bracket"></i><a href="./login">Logout</a></li>
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
            <div class="div-contato">
                <a href=""><i class="fa-brands fa-whatsapp"></i>5543999752103</a>
            </div>
            <br/>
            <div class="div-contato">
                <a href=""><i class="fa-solid fa-phone"></i>(43) 3028-3484</a>
            </div>
            <br/>
            <div class="div-contato">
                <i class="fa-solid fa-envelope"></i>
                <span>contato@komunhao.com.br</span>
            </div>
            <br/>
            <div class="div-contato">
                <i class="fa-solid fa-location-dot"></i>
                <span>Rua Barão de Loreto, 15 Vila Fujita - Londrina - PR</span>
            </div>
        </div>
        <div class="sociais">
            <h4>Permaneça conectado</h4>
            <button><a href="#"><i class="fa-brands fa-instagram"></i></a></button>
            <button><a href="#"><i class="fa-brands fa-facebook"></i></a></button>
        </div>
    </section>
    <footer>
        <div class="text-footer">
            <span>Copyright KOMUNHÃO LIVRARIA CRISTÃ - 20860874000126 - 2024. Todos os direitos reservados.</span>
        </div>
    </footer>
    </body>
</html>
