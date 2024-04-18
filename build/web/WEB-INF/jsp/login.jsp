<%-- 
    Document   : login
    Created on : 15/04/2024, 15:02:45
    Author     : Senai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://kit.fontawesome.com/6f0f753ce6.js" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style/style-login.css" rel="stylesheet" type="text/css"/>
        <title>Login Usuário</title>
    </head>
    <body>
        <main>
            <div class="login">
                <form action="logar" method="get">
                    <h1>Login</h1>
                    <div class="input-box">                        
                        <input type="text" name="username" id="username" placeholder="Usuário">        
                        <i class="fa-regular fa-user"></i>               
                    </div>
                    <div class="input-box">                        
                        <input type="text" name="password" id="password" placeholder="Senha">
                        <i class="fa-solid fa-lock"></i>
                    </div>

                    <div class="remember-register">
                        <label><input type="checkbox">Lembrar de mim</label>                      
                    </div>

                    <button type="submit" class="btn">LOGIN</button>

                    <div class="register-link">
                        <p>Não possui registro? <a href="./cadastro">Cadastre-se</a></p>
                    </div>
                </form>
            </div>
        </main>
    </body>
</html>
