<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="PT-BR">
<head>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"  integrity ="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

<link type="text/css" rel="stylesheet" href="Style.css" />


<meta charset="UTF-8">
<title>Editar Cadastros Code Travel</title>
</head>
<body class="container-fluid">
	<section id="form1" class="form">
        <div class="col-md-12 col-md-offset-1">
          <div class="booking-form">
            <form name="cadastro" action="alterar">
              <div class="form-group">
               <h1>Alterar Um Destino</h1>
              </div>
              <div class="row">
                <div class="col-md-3">
                  <div class="form-group">
                    <span class="form-label">Id: </span>
                    <input name="id" class="form-control" type="text" readonly value="<%out.print(request.getAttribute("id"));%>">
                  </div>
                </div>
              <div class="row">
                <div class="col-md-6">
                  <div class="form-group">
                    <span class="form-label">Origem: </span>
                    <input name="origem" class="form-control" type="text" value="<%out.print(request.getAttribute("origem"));%>">
                  </div>
                </div>
                <div class="col-md-6">
                  <div class="form-group">
                    <span class="form-label">Destino: </span>
                    <input name="destino" class="form-control" type="text" value="<%out.print(request.getAttribute("destino"));%>">
                  </div>
                </div>
              </div>
              <div class="row">
                <div class="col-md-6">
                  <div class="form-group">
                    <span class="form-label">Data de Ida</span>
                    <input name="dataida" class="form-control" type="date" required value="<%out.print(request.getAttribute("dataida"));%>">
                  </div>
                </div>
                <div class="col-md-6">
                  <div class="form-group">
                    <span class="form-label">Data de Volta</span>
                    <input name="datavolta" class="form-control" type="date" required value="<%out.print(request.getAttribute("datavolta"));%>">
                  </div>
                </div>
              </div>
              <div class="row">
                <div class="col-md-4">
                  <div class="form-group">
                    <span class="form-label">Adultos (18+)</span>
                    <select name="adulto" class="form-control" value="<%out.print(request.getAttribute("adulto"));%>">
                      <option>1</option>
                      <option>2</option>
                      <option>3</option>
                    </select>
                    <span class="select-arrow"></span>
                  </div>
                </div>
                <div class="col-md-4">
                  <div class="form-group">
                    <span class="form-label">Crianças (0-17)</span>
                    <select name="crianca" class="form-control" value="<%out.print(request.getAttribute("crianca"));%>">
                      <option>0</option>
                      <option>1</option>
                      <option>2</option>
                    </select>
                    <span class="select-arrow"></span>
                  </div>
                </div>
                <div class="col-md-4">
                  <div class="form-group">
                    <span class="form-label">Escolha classe: </span>
                    <select name="classe" class="form-control" value="<%out.print(request.getAttribute("classe"));%>">
                      <option>Classe Economica</option>
                      <option>Classe Executiva</option>
                      <option>Primeira Classe</option>
                    </select>
                    <span class="select-arrow"></span>
                  </div>
                </div>
              </div>
              <div class="form-btn">
                <button class="submit-btn" type="button" value="salvar" onclick="validar()">Alterar Passagens</button>
                   </div>
                   <br>
                   <br>
                   <div class="form-btn">
                      <button class="submit-btn" type="reset">Limpar Cadastro</button>
                   </div>
                 </form>
                </div>
              </div>
      </section>
    <script src="Scripts/validador.js"></script>
</body>
</html>