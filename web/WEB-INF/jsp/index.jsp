<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

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
                <form action="">
                    <h1>Login</h1>
                    <div class="input-box">                        
                        <input type="text" placeholder="Usuário">        
                        <i class="fa-regular fa-user"></i>               
                    </div>
                    <div class="input-box">                        
                        <input type="text" placeholder="Senha">
                        <i class="fa-solid fa-lock"></i>
                    </div>

                    <div class="remember-register">
                        <label><input type="checkbox">Lembrar de mim</label>                      
                    </div>

                    <button type="submit" class="btn">LOGIN</button>

                    <div class="register-link">
                        <p>Não possui registro? <a href="#">Cadastre-se</a></p>
                    </div>
                </form>
            </div>
        </main>
    </body>
</html>
