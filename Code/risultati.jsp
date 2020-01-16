
<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*,Bean.*,Database.*"%>

<%
	ArrayList<Opera> opere = new ArrayList<>();

	String visible = (String) request.getAttribute("vis");
	// mette i risultati in opere
	opere = (ArrayList) request.getAttribute("listaopere");
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

				<%
					if (visible == "visible") { // se ci sono risultati fa vedere la tabella altrimenti no
				%>
				<table class="table table-hover">
					<thead class="th-center">
						<tr>
							<th>Immagine Bene Culturale</th>
							<th>Bene Culturale</th>
							<th>Soggetto</th>
							<th>Contenitore</th>
							<th>Datazione</th>
							<th>Autore</th>
							<th>Comune di Appartenenza</th>
							<th>Visualizza Scheda</th>
						</tr>
					</thead>
					<tbody>

						<%
					
						
						//la servlet CercaBene ha trovato tali valori
							for (int i = 0; i < opere.size(); i++) {
						%>
						<form action="ApriSchedaServlet" method="get">					
						<tr>
							<td><img width="70" height="70"
								src=<%=opere.get(i).getImage()%> alt="Img ND"></td>
							<td><%=opere.get(i).getBeneCulturale()%></td>
							<td><%=opere.get(i).getSoggetto()%></td>
							<td><%=opere.get(i).getContenitore()%></td>
							<td><%=opere.get(i).getDatazione()%></td>
							<td><%=opere.get(i).getAutore()%></td>
							<td><%=opere.get(i).getComune() +" "+opere.get(i).getProvincia()%></td>
							<input size="3" name="codice" type="hidden"
									value="<%=opere.get(i).getCodice()%>" />
							<td><input type="image" id="aprischeda" name="submitta"
									value="addcarr" src="style/carrello.png" /></td>
						</tr>						
						</form>
						<%
							}
						%>
					</tbody>
				</table>
				<%
					} else if (visible == "nulla") {
				%>
				<h3>La ricerca non ha prodotto risultati...</h3>
				<%
					} else {
				%>
				<h4>Nessun Risultato</h4>
				<%
					}
				%>
				</table>

			</div>
		</div>
		<div id="content_footer"></div>
		<div id="footer">
			Copyright © Anna Tomeo 2018 |</a>
		</div>
	</div>
</body>
</html>
