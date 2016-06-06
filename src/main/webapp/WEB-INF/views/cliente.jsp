<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<title>Cliente</title>
</head>
<body>

	<h1>Cliente</h1>
	
	<form method="post" action="adicionarClientes">
		<label for="nome">Nome</label>
		<input type="text" name="nome" id="nome"><br>
		<label for="nome">Rua</label>
		<input type="text" name="ruaNroComp" id="ruaNroComp"><br>
		<label for="nome">Bairro</label>
		<input type="text" name="bairro" id="bairro"><br>
		<label for="nome">Cidade</label>
		<input type="text" name="cidade" id="cidade"><br>
		
		<input type="submit" value="adicionar">
	
	</form>
	
	<h2>Lista de Clientes</h2>
	
 	<table>
	  <thead>
	    <tr>
	      <td>Código</td>
	      <th>Nome</th>
	      <th>Endereco</th>
	    </tr>
	  </thead>
	  <tfoot>
	    <tr>
	      <td>Código</td>
	      <td>Nome</td>
	      <td>Endereco</td>
	    </tr>
	  </tfoot>
	  <tbody>
	  
	  <c:forEach var="c" items="${clientes}">
	  
	    <tr>  <td>${c.codigo}</td>
		      <td>${c.nome}</td>
		      <td>${c.ruaNroComp}</td>
	    </tr>
	   
	  </c:forEach> 	
	
	  </tbody>
	</table>

</body>
</html>