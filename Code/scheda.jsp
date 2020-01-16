
<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*,Bean.*,Database.*"%>

<%
	Opera opera = new Opera();
	opera = (Opera) request.getAttribute("opera");
%>

<!DOCTYPE HTML>
<html><head><title>Ricerca Bene Culturale</title><meta name="description" content="website description"><meta name="keywords" content="website keywords, website keywords"><meta http-equiv="content-type" content="text/html; charset=windows-1252"><link rel="stylesheet" type="text/css" href="style/style.css" title="style"></head><body>
  <div id="main">
    <div id="header">
      <div id="logo">
        <div id="logo_text">
          <!-- class="logo_colour", allows you to change the colour of the text -->
          <h1><a href="index.jsp">Beni Culturali<span class="logo_colour"> in Campania</span></a></h1>
          <h2>Effettua Ricerca di Opere d'arte in campania.</h2>
        </div>
      </div>
      <div id="menubar">
        <ul id="menu"><!-- put class="selected" in the li tag for the selected page - to highlight which page you're on --><li class="selected"><a href="index.jsp">Home</a></li>
        </ul></div>
    </div>
    <div id="site_content">
      <div id="content">
      <body>
       	  <h1>Soggetto: </h1> <p><strong><%=opera.getSoggetto()%></strong></p>
       	  
		  <h1>Bene Culturale: </h1> <p><strong><%=opera.getBeneCulturale()%></strong></p>
		  <h1>Localizzazione: </h1> <p><%=opera.getComune()+" "+ opera.getProvincia() +" "+ opera.getIndirizzo()%></p>
		  <h1>Contenitore: </h1> <p><%=opera.getContenitore()%></p>
		  <h1>Datazione: </h1> <p><%=opera.getDatazione()%></p>
		  <h1>Autore: </h1>  <p><%=opera.getAutore()%></p>
		  <h1>Materia Tecnica: </h1>  <p><%=opera.getMateria_Tecnica()%></p>
       	  <h1>Misure: </h1>  <p><%=opera.getMisure()%></p>
       	  <h1>DatiAnalitici: </h1>  <p><%=opera.getDati_Analitici()%></p>
       	  <h1>Definizione: </h1>  <p><%=opera.getDefinizione()%></p>   
       	  <h1>Anno Creazione: </h1> <p><%=opera.getAnnoCreazione()%></p>
       	  <h1>Anno Modifica: </h1> <p><%=opera.getAnnoModifica()%></p>
       	  
       	  <span class="right"><img src="<%=opera.getImage() %>" alt="Immagine Non Disponibile in Archivio"></span>
        <p>
         <%=opera.getNotizie()%>
        </p>
        
     
       	  				
   </body>
		</div>
    </div>
    <div id="content_footer"></div>
    <div id="footer">
      Copyright � Anna Tomeo 2018 |</a>
</div>
  </div>
</body></html>
