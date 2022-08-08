package ClassiProgetto;

import java.time.LocalDate;

public class Tessera {
	
	private boolean valido;
	private LocalDate tempoValidita;
	private LocalDate dataCreazione;
	private Utente utente;
	
	public Tessera(LocalDate dataCreazione, Utente utente) {
		super();
		this.valido = isValido();
		this.tempoValidita = dataCreazione.plusYears(1);
		this.dataCreazione = dataCreazione;
		this.utente = utente;
	}
	
	public boolean isValido () {
		//LocalDate dataAttuale = new LocalDate.now();
		if(LocalDate.now().isAfter(tempoValidita)) {
			return false;
		} else {
			return true;
		}
	}
	
	

}
