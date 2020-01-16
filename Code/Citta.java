package Bean;

public class Citta {
	private int id;
	private String Regione;
	private String Provincia;
	private String comune;

	public Citta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Citta(int id, String regione, String provincia, String comune) {
		super();
		this.id = id;
		Regione = regione;
		Provincia = provincia;
		this.comune = comune;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	@Override
	public String toString() {
		return "Citta [id=" + id + ", Regione=" + Regione + ", Provincia=" + Provincia + ", comune=" + comune + "]";
	}

	
	
}
