<%-- 
    Document   : cadastro
    Created on : 04/04/2024, 15:46:31
    Author     : Senai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="style/style-cadastro.css" rel="stylesheet" type="text/css"/>
        <script src="https://kit.fontawesome.com/6f0f753ce6.js" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Usuário</title>
    </head>
    <body>
        <main>
            <div class="cadastro">
                <form action="cadastrar">
                    <h1>Cadastro</h1>                   
                    <div class="input-box">                        
                        <input type="text" placeholder="Usuário">        
                        <i class="fa-regular fa-user"></i>               
                    </div>
                    <div class="input-box">                        
                        <input type="text" placeholder="Senha">
                        <i class="fa-solid fa-lock"></i>
                    </div>
                    <div class="input-box">
                        <input type="text" placeholder="Email">
                        <i class="fa-solid fa-envelope"></i>
                    </div>
                    <div class="input-box">
                        <input type="text" placeholder="CPF">
                        <i class="fa-solid fa-key"></i>
                    </div>
                    <div class="input-box">
                        <input type="text" placeholder="Telefone">
                        <i class="fa-solid fa-phone"></i>
                    </div>

                    <div class="remember-register">
                        <label><input type="checkbox">Lembrar de mim</label>                      
                    </div>

                    <button type="submit" class="btn">CADASTRAR</button>

                    <div class="register-link">
                        <p>Já possui conta? <a href="./login">Login</a></p>
                    </div>
                </form>
            </div>
        </main>
    </body>
</html>
