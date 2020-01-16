
<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*,Bean.*,Database.*"%>

<%
	ArrayList<Citta> citta = new ArrayList<>();
	citta = Database.getCitta();
%>


<!DOCTYPE HTML>
<html>
<head>
<title>Ricerca Bene Culturale</title>
<meta name="description" content="website description">
<meta name="keywords" content="website keywords, website keywords">
<meta http-equiv="content-type"
	content="text/html; charset=windows-1252">
<link rel="stylesheet" type="text/css" href="style/style.css"
	title="style">
</head>
<body>
	<div id="main">
		<div id="header">
			<div id="logo">
				<div id="logo_text">
					<!-- class="logo_colour", allows you to change the colour of the text -->
					<h1>
						<a href="index.jsp">Beni Culturali<span class="logo_colour">
								in Campania</span></a>
					</h1>
					<h2>Effettua Ricerca di Opere d'arte in campania.</h2>
				</div>
			</div>
			<div id="menubar">
				<ul id="menu">
					<!-- put class="selected" in the li tag for the selected page - to highlight which page you're on -->
					<li class="selected"><a href="index.jsp">Home</a></li>
				</ul>
			</div>
		</div>
		<div id="site_content">
			<div id="content">
				<h1>CERCA UN BENE CULTURALE PER PROVINCIA, PER COMUNE O PER
					TIPO DI BENE CULTURALE</h1>
				<p></p>
				<!-- da qui inizia la prima ricerca -->
				<form id="search" method="get" action="CercaBene">

					<select name="siti">
					
						<option value="PROVINCIA" selected="selected">Ricerca per
							Provincia</option>
						<option value="COMUNE">Ricerca per Comune</option>
						<option value="BENE_CULTURALE">Ricerca per Bene_Culturale</option>
						<option value="AUTORE">Ricerca per Autore</option>
						<option value="ANNO_MODIFICA">Ricerca per Anno di
							modifica</option>
						<option value="MATERIA_TECNICA">Ricerca per Materia
							Tecnica</option>
					</select>
					
					 <input class="search" type="text" name="nomeRiferimento"
						placeholder="Inserisci Provincia, Comune o Bene Culturale..." />
						
					<input name="search" type="image"
						style="border: 2; margin: 0 0 5px 10px;" src="style/search.png"
						alt="Search" title="Search" />
				</form>
				<p></p>
				<p></p>

				<h1>Clicca su un Comune per ottenere la lista di tutti i beni
					di quel comune:</h1>

				<form id="search" method="get" action="ListaComuniServlet">

					<select name="cerca2">
						<% for (int i = 0; i<citta.size(); i++) { %>
						
						<option id="COMUNE"><%=citta.get(i).getComune()%></option>						
						<%} %>
					</select>
					<input type="image" id="addcarr" name="submitta"
						value="addcarr" src="style/search.png" />
					


				</form>

			</div>
		</div>
		<div id="content_footer"></div>
		<div id="footer">
			<a> Copyright © Anna Tomeo 2018 |</a>
		</div>
	</div>
</body>
</html>
