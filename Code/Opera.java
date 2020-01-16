package Bean;

public class Opera {
	private String Image;
	private String BeneCulturale;
	private String Soggetto;
	private String Codice;
	private String Localizzazione;
	private String Contenitore;
	private String Datazione;
	private String Ambito_Culturale;
	private String Autore;
	private String Materia_Tecnica;
	private String Misure;
	private String Dati_Analitici;
	private String Notizie;
	private String Definizione;
	private String Regione;
	private String Provincia;
	private String Comune;
	private String Indirizzo;
	private int AnnoCreazione;
	private String AnnoModifica;
	
	
	
	public Opera() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Opera(String image, String beneCulturale, String soggetto, String codice, String localizzazione,
			String contenitore, String datazione, String ambito_Culturale, String autore, String materia_Tecnica,
			String misure, String dati_Analitici, String notizie, String definizione, String regione, String provincia,
			String comune, String indirizzo, int annoCreazione, String annoModifica) {
		super();
		Image = image;
		BeneCulturale = beneCulturale;
		Soggetto = soggetto;
		Codice = codice;
		Localizzazione = localizzazione;
		Contenitore = contenitore;
		Datazione = datazione;
		Ambito_Culturale = ambito_Culturale;
		Autore = autore;
		Materia_Tecnica = materia_Tecnica;
		Misure = misure;
		Dati_Analitici = dati_Analitici;
		Notizie = notizie;
		Definizione = definizione;
		Regione = regione;
		Provincia = provincia;
		Comune = comune;
		Indirizzo = indirizzo;
		AnnoCreazione = annoCreazione;
		AnnoModifica = annoModifica;
	}



	public String getImage() {
		return Image;
	}



	public void setImage(String image) {
		Image = image;
	}



	public String getBeneCulturale() {
		return BeneCulturale;
	}



	public void setBeneCulturale(String beneCulturale) {
		BeneCulturale = beneCulturale;
	}



	public String getSoggetto() {
		return Soggetto;
	}



	public void setSoggetto(String soggetto) {
		Soggetto = soggetto;
	}



	public String getCodice() {
		return Codice;
	}



	public void setCodice(String codice) {
		Codice = codice;
	}



	public String getLocalizzazione() {
		return Localizzazione;
	}



	public void setLocalizzazione(String localizzazione) {
		Localizzazione = localizzazione;
	}



	public String getContenitore() {
		return Contenitore;
	}



	public void setContenitore(String contenitore) {
		Contenitore = contenitore;
	}



	public String getDatazione() {
		return Datazione;
	}



	public void setDatazione(String datazione) {
		Datazione = datazione;
	}



	public String getAmbito_Culturale() {
		return Ambito_Culturale;
	}



	public void setAmbito_Culturale(String ambito_Culturale) {
		Ambito_Culturale = ambito_Culturale;
	}



	public String getAutore() {
		return Autore;
	}



	public void setAutore(String autore) {
		Autore = autore;
	}



	public String getMateria_Tecnica() {
		return Materia_Tecnica;
	}



	public void setMateria_Tecnica(String materia_Tecnica) {
		Materia_Tecnica = materia_Tecnica;
	}



	public String getMisure() {
		return Misure;
	}



	public void setMisure(String misure) {
		Misure = misure;
	}



	public String getDati_Analitici() {
		return Dati_Analitici;
	}



	public void setDati_Analitici(String dati_Analitici) {
		Dati_Analitici = dati_Analitici;
	}



	public String getNotizie() {
		return Notizie;
	}



	public void setNotizie(String notizie) {
		Notizie = notizie;
	}



	public String getDefinizione() {
		return Definizione;
	}



	public void setDefinizione(String definizione) {
		Definizione = definizione;
	}



	public String getRegione() {
		return Regione;
	}



	public void setRegione(String regione) {
		Regione = regione;
	}



	public String getProvincia() {
		return Provincia;
	}



	public void setProvincia(String provincia) {
		Provincia = provincia;
	}



	public String getComune() {
		return Comune;
	}



	public void setComune(String comune) {
		Comune = comune;
	}



	public String getIndirizzo() {
		return Indirizzo;
	}



	public void setIndirizzo(String indirizzo) {
		Indirizzo = indirizzo;
	}



	public int getAnnoCreazione() {
		return AnnoCreazione;
	}



	public void setAnnoCreazione(int annoCreazione) {
		AnnoCreazione = annoCreazione;
	}



	public String getAnnoModifica() {
		return AnnoModifica;
	}



	public void setAnnoModifica(String annoModifica) {
		AnnoModifica = annoModifica;
	}



	@Override
	public String toString() {
		return "Opera [Image=" + Image + ", BeneCulturale=" + BeneCulturale + ", Soggetto=" + Soggetto + ", Codice="
				+ Codice + ", Localizzazione=" + Localizzazione + ", Contenitore=" + Contenitore + ", Datazione="
				+ Datazione + ", Ambito_Culturale=" + Ambito_Culturale + ", Autore=" + Autore + ", Materia_Tecnica="
				+ Materia_Tecnica + ", Misure=" + Misure + ", Dati_Analitici=" + Dati_Analitici + ", Notizie=" + Notizie
				+ ", Definizione=" + Definizione + ", Regione=" + Regione + ", Provincia=" + Provincia + ", Comune="
				+ Comune + ", Indirizzo=" + Indirizzo + ", AnnoCreazione=" + AnnoCreazione + ", AnnoModifica="
				+ AnnoModifica + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Ambito_Culturale == null) ? 0 : Ambito_Culturale.hashCode());
		result = prime * result + AnnoCreazione;
		result = prime * result + ((AnnoModifica == null) ? 0 : AnnoModifica.hashCode());
		result = prime * result + ((Autore == null) ? 0 : Autore.hashCode());
		result = prime * result + ((BeneCulturale == null) ? 0 : BeneCulturale.hashCode());
		result = prime * result + ((Codice == null) ? 0 : Codice.hashCode());
		result = prime * result + ((Comune == null) ? 0 : Comune.hashCode());
		result = prime * result + ((Contenitore == null) ? 0 : Contenitore.hashCode());
		result = prime * result + ((Datazione == null) ? 0 : Datazione.hashCode());
		result = prime * result + ((Dati_Analitici == null) ? 0 : Dati_Analitici.hashCode());
		result = prime * result + ((Definizione == null) ? 0 : Definizione.hashCode());
		result = prime * result + ((Image == null) ? 0 : Image.hashCode());
		result = prime * result + ((Indirizzo == null) ? 0 : Indirizzo.hashCode());
		result = prime * result + ((Localizzazione == null) ? 0 : Localizzazione.hashCode());
		result = prime * result + ((Materia_Tecnica == null) ? 0 : Materia_Tecnica.hashCode());
		result = prime * result + ((Misure == null) ? 0 : Misure.hashCode());
		result = prime * result + ((Notizie == null) ? 0 : Notizie.hashCode());
		result = prime * result + ((Provincia == null) ? 0 : Provincia.hashCode());
		result = prime * result + ((Regione == null) ? 0 : Regione.hashCode());
		result = prime * result + ((Soggetto == null) ? 0 : Soggetto.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Opera other = (Opera) obj;
		if (Ambito_Culturale == null) {
			if (other.Ambito_Culturale != null)
				return false;
		} else if (!Ambito_Culturale.equals(other.Ambito_Culturale))
			return false;
		if (AnnoCreazione != other.AnnoCreazione)
			return false;
		if (AnnoModifica == null) {
			if (other.AnnoModifica != null)
				return false;
		} else if (!AnnoModifica.equals(other.AnnoModifica))
			return false;
		if (Autore == null) {
			if (other.Autore != null)
				return false;
		} else if (!Autore.equals(other.Autore))
			return false;
		if (BeneCulturale == null) {
			if (other.BeneCulturale != null)
				return false;
		} else if (!BeneCulturale.equals(other.BeneCulturale))
			return false;
		if (Codice == null) {
			if (other.Codice != null)
				return false;
		} else if (!Codice.equals(other.Codice))
			return false;
		if (Comune == null) {
			if (other.Comune != null)
				return false;
		} else if (!Comune.equals(other.Comune))
			return false;
		if (Contenitore == null) {
			if (other.Contenitore != null)
				return false;
		} else if (!Contenitore.equals(other.Contenitore))
			return false;
		if (Datazione == null) {
			if (other.Datazione != null)
				return false;
		} else if (!Datazione.equals(other.Datazione))
			return false;
		if (Dati_Analitici == null) {
			if (other.Dati_Analitici != null)
				return false;
		} else if (!Dati_Analitici.equals(other.Dati_Analitici))
			return false;
		if (Definizione == null) {
			if (other.Definizione != null)
				return false;
		} else if (!Definizione.equals(other.Definizione))
			return false;
		if (Image == null) {
			if (other.Image != null)
				return false;
		} else if (!Image.equals(other.Image))
			return false;
		if (Indirizzo == null) {
			if (other.Indirizzo != null)
				return false;
		} else if (!Indirizzo.equals(other.Indirizzo))
			return false;
		if (Localizzazione == null) {
			if (other.Localizzazione != null)
				return false;
		} else if (!Localizzazione.equals(other.Localizzazione))
			return false;
		if (Materia_Tecnica == null) {
			if (other.Materia_Tecnica != null)
				return false;
		} else if (!Materia_Tecnica.equals(other.Materia_Tecnica))
			return false;
		if (Misure == null) {
			if (other.Misure != null)
				return false;
		} else if (!Misure.equals(other.Misure))
			return false;
		if (Notizie == null) {
			if (other.Notizie != null)
				return false;
		} else if (!Notizie.equals(other.Notizie))
			return false;
		if (Provincia == null) {
			if (other.Provincia != null)
				return false;
		} else if (!Provincia.equals(other.Provincia))
			return false;
		if (Regione == null) {
			if (other.Regione != null)
				return false;
		} else if (!Regione.equals(other.Regione))
			return false;
		if (Soggetto == null) {
			if (other.Soggetto != null)
				return false;
		} else if (!Soggetto.equals(other.Soggetto))
			return false;
		return true;
	}
	
	
	

}
