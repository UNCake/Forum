<%--
  Created by IntelliJ IDEA.
  User: Alejandro
  Date: 12/11/2015
  Time: 7:58 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ defaultCodec="none" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Foro</title>
    <asset:stylesheet src="bootstrap/css/bootstrap.min.css"/>
    <asset:stylesheet src="agency.css"/>
</head>

<body>
<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="navbar-header page-scroll">
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand page-scroll" href="home">UNCakeForum</a>
        </div>

        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

            <ul class="nav navbar-nav navbar-right">
                <li class="hidden">
                    <a href="#page-top"></a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div class="container center-contatiner">
    <g:form class="form-signin" action="doLogin" method="post">
        <form class="form-signin">
            <h2 class="form-signin-heading font-uncake" align="center">UNCakeForum</h2>
            <div class="form-group">
                <label >Username</label>
                <div style="display: flex">
                    <input type="email" id="email" class="form-control"  placeholder="Introduce tu email" required autofocus name="username">
                    <div class="error">${flash.message2}</div>
                </div>
            </div>
            <div class="form-group" style="margin-bottom: 0px">
                <div style="display: flex">
                    <div class="col-6">
                        <label >Password</label>
                    </div>
                </div>
                <div style="display: flex">
                    <input type="password" id="password" class="form-control" placeholder="Introduce tu contraseña" required name='password'>
                </div>
            </div>
        </form>
    </g:form>
</div> <!-- /container -->
<div class="row">
    <p class="text-center">Aplicación realizada por:</p>
    <p class="text-center">UNCake</p>
    <p class="text-center">Ana Maria Rodriguez</p>
    <p class="text-center">Hugo Alejandro Arias</p>
    <p class="text-center">Santiago Carvajal</p>
    <p class="text-center">Santiago Hernandez</p>
    <p class="text-center">Alejandro Recaman</p>
</div>
</body>
</html>