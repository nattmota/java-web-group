<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html lang="pt-br">
    <head>        
        <meta charset="UTF-8">
        <script src="https://kit.fontawesome.com/6f0f753ce6.js" crossorigin="anonymous"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <link href="./style/style-index.css" rel="stylesheet" type="text/css"/>
        <link href="./style/header.css" rel="stylesheet" type="text/css"/>
        <link href="./style/footer.css" rel="stylesheet" type="text/css"/>
        <title>Komunhão Livraria</title>
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
                    <li><a href="#">Início</a></li>
                    <li><a href="./produtos-categorias">Livros <i class="fa-solid fa-chevron-down"></i></a></li>
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
            <section class="carrosel">
                <div id="carouselExampleIndicators" class="carousel slide"> 
                    <div class="carousel-indicators">
                        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
                        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
                    </div>
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <img src="./assets/carrosel-komunhao.webp" class="d-block w-100" alt="...">
                        </div>
                        <div class="carousel-item">
                            <img src="./assets/carrosel-komunhao2.webp" class="d-block w-100" alt="...">
                        </div>
                        <div class="carousel-item">
                            <img src="./assets/carrosel-komunaho3.webp" class="d-block w-100" alt="...">
                        </div>
                    </div>
                    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="visually-hidden">Previous</span>
                    </button>
                    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="visually-hidden">Next</span>
                    </button> 
                </div> 
            </section>
            <section class="show-products">
                <div class="h1-text">
                    <h1>DESTAQUES</h1>
                </div>
                <div class="card-products">
                    <c:forEach items="${produtos}" var="produto">
                        <div class="card" style="width: 18rem;">
                            <img src="./assets/livro1.webp" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title"><b>${produto.nome}</b></h5>
                                <div class="center-element">
                                    <h5 class="card-price" >R$ ${produto.valor}</h5>
                                </div>    
                                <div class="center-element">
                                    <a href="#" class="btn btn-primary">ADICIONAR</a>
                                    <a href="./produtos?id=${produto.idProduto}" class="btn btn-primary">VISITAR</a>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </section>
            <section class="email-section">
                <div class="newsletter">
                    <h3>NEWSLETTER</h3>
                    <h2>Receba todas as promoções</h2>
                    <p>Quer receber nossas ofertas? Cadastre-se e comece a recebê-las!</p>
                    <div class="input-box">
                        <i class="fa-solid fa-arrow-right"></i>
                        <input type="text" placeholder="E-mail">
                    </div>
                </div>
            </section>
            <section class="instagram-section">
                <div class="to-instagram">
                    <div class="tag-insta">
                        <h2><i class="fa-brands fa-instagram"></i>komunhaolivraria</p> 
                    </div>   
                    <h3>Estamos no instagram</h3>
                    <button><b><a href="https://www.instagram.com/komunhaolivraria/">SIGA-NOS</a></b></button>
                </div>
            </section>
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
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
