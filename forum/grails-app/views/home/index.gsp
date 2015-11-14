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
            <a class="navbar-brand page-scroll" href="#page-top">UNCakeForum</a>
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
<header>
    <div class="container">

        <div class="row">
            <br><br><br>
            <h3 style="color: #333;">Bienvenido</h3>
            <br><br>
        </div>

    </div>
</header>
<div class="row">
    <div class="col-sm-12" style="border-style: solid;">
        <div class="col-md-6" style="border-style: solid;"><br>Bienvenido Alejandro<br><br></div>
        <div class="col-md-2" style="border-style: solid;"><br>Mi Perfil<br><br></div>
        <div class="col-md-2" style="border-style: solid;"><br>Mis Posts<br><br></div>
        <div class="col-md-2" style="border-style: solid;"><br>Logout<br><br></div>
    </div>
</div>
<div class="row">
    <div class="col-sm-12" style="border-style: solid;">
        <div class="col-md-6">
            <br>
            <form style="border-style: solid;">
                <br>
                <p class="text-center">Bienvenido a la aplicación forum 2.0</p>
                <br>
                <p class="text-left" style="position: relative; left: 30px;">Consultar:</p>
                <p class="text-left" style="position: relative; left: 30px;">Foros</p>
                <p class="text-left" style="position: relative; left: 30px;">Usuarios</p>
                <p class="text-left" style="position: relative; left: 30px;">Entradas (Post)</p>
                <p class="text-left" style="position: relative; left: 30px;">Archivos</p>
                <br>
                <br>
            </form>
        </div>
        <div class="col-md-3">
            <br>
            <form style="border-style: solid;">
                <br>
                <p class="text-center">Ultimas entradas (Post)</p>
                <br>
                <textarea class="form-control" style="position: relative; left: 10px; width: 285px; height: 171px;" rows="3"></textarea>
                <br>
                <br>
            </form>
        </div>
        <div class="col-md-3">
            <br>
            <form style="border-style: solid;">
                <br>
                <p class="text-center">Foros con mas entradas</p>
                <br>
                <textarea class="form-control" style="position: relative; left: 10px; width: 285px; height: 171px;" rows="3"></textarea>
                <br>
                <br>
            </form>
        </div>
    </div>
</div>
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