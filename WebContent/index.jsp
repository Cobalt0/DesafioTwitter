<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- <jsp:forward page="MostMentions" /> --%>
</head>
<body>
	<h1>Listagem dos Tweets</h1>
	
	<table border="1">
		<thead>
			<tr>
				<td><b>Autor Twitter</b></td>
				<td><b>Número de Seguidores</b></td>
				<td><b>Número de Retweets</b></td>
				<td><b>Quantidade de Likes</b></td>
				<td><b>Conteúdo do Tweet</b></td>
				<td><b>Data de criação do tweet</b></td>			
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listaTwitter}" var="tweet">
			<tr>
				<td>${tweet.getAutor().getScreenNameAutor()}</td>
				<td>${tweet.getAutor().getNumeroSeguidoresAutor()}</td>
				<td>${tweet.getNumeroRetweets()}</td>
				<td>${tweet.getLikesTwitter()}</td>
				<td>${tweet.getConteudoTwitter()}</td>
				<td>${tweet.getDataTwitter()}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>