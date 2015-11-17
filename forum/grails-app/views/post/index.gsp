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
<script>
    function createBtn() {
        el = document.getElementById("createForm");
        //console.log(document.getElementById("diagNombre").innerHTML);
        el.style.visibility = (el.style.visibility == "visible") ? "hidden" : "visible";
    }
    function searchBtn() {
        el = document.getElementById("buscarForm");
        //console.log(document.getElementById("diagNombre").innerHTML);
        el.style.visibility = (el.style.visibility == "visible") ? "hidden" : "visible";
    }
</script>
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
            <a class="navbar-brand page-scroll" href="../home">UNCakeForum</a>
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
            <h3 style="color: #333;">Post</h3>
            <br><br>
        </div>

    </div>
</header>
<div class="row">

    <div class="col-sm-12" style="border-style: solid;">
        <div class="col-md-6" style="border-style: solid;"><br>Bienvenido Alejandro<br><br></div>
        <div class="col-md-3"><button style="display: block; width: 100%;" onclick="createBtn()"><br>Crear<br><br></button></div>
        <div class="col-md-3"><button style="display: block; width: 100%;" onclick="searchBtn()"><br>Consultar<br><br></button></div>
    </div>
</div>
<div class="row">
    <div class="col-sm-12" id="createForm" style="border-style: solid;">
        <g:form name="myForm" url="[controller:'post',action:'create']" class="form-signin">
            <h2 class="form-signin-heading " align="center">Crear Post</h2>
            <div class="form-group">
                <label class="sr-only">Topic</label>
                <input type="text" class="form-control" placeholder="Topic" required name="topic">
            </div>
            <div class="form-group" >
                <label class="sr-only">Comment</label>
                <input type="text" class="form-control" placeholder="Comment" required name="comment"  >
            </div>
            <div class="form-group">
                <label class="sr-only">Rate</label>
                <input type="text" class="form-control" placeholder="Rate" required name="rate">
            </div>
            <div class="checkbox">
                <label>
                    <input type="checkbox"> Allowed
                </label>
            </div>
            <button class="btn btn-lg btn-primary btn-block color-black" type="submit">Guardar</button>
        </g:form>
    </div>
    <div class="col-sm-12" id="buscarForm" style="border-style: solid;">
        <div class="col-md-4 col-sm-6 portfolio-item">
            <table class="table table-bordered">
                <tr>
                    <th>Topic</th>
                    <th>DateCreated</th>
                    <th>LastUpdate</th>
                    <th>Comments</th>
                    <th>Rate</th>
                </tr>
                <g:each in="${postList}" var="p">
                    <tr>
                        <td>${p.topic}</td>
                        <td>${p.dateCreated}</td>
                        <td>${p.lastupdate}</td>
                        <td>${p.comments}</td>
                        <td>${p.rate}</td>
                        <td><g:link action="delete" id="${p.id}">Borrar</g:link></td>
                    </tr>
                </g:each>
            </table>
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