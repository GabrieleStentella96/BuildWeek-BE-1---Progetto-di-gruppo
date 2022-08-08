package ClassiProgetto;

public class Tratta {

	private int tempoPercorrenza;
	private String puntoPartenza;
	private String capolinea;
	
	public Tratta(int tempoPercorrenza, String puntoPartenza, String capolinea) {
		super();
		this.tempoPercorrenza = tempoPercorrenza;
		this.puntoPartenza = puntoPartenza;
		this.capolinea = capolinea;
	}
	
	public int getTempoPercorrenza() {
		return tempoPercorrenza;
	}
	public void setTempoPercorrenza(int tempoPercorrenza) {
		this.tempoPercorrenza = tempoPercorrenza;
	}
	public String getPuntoPartenza() {
		return puntoPartenza;
	}
	public void setPuntoPartenza(String puntoPartenza) {
		this.puntoPartenza = puntoPartenza;
	}
	public String getCapolinea() {
		return capolinea;
	}
	public void setCapolinea(String capolinea) {
		this.capolinea = capolinea;
	}
	
	
}
