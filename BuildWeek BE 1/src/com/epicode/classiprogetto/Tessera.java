package com.epicode.classiprogetto;

import java.time.LocalDate;

public class Tessera {
	
	private boolean valido;
	private LocalDate tempoValidita;
	private LocalDate dataCreazione;
	private Utente utente;
	private String codiceId;
	
	public Tessera(LocalDate dataCreazione, Utente utente) {
		super();
		this.valido = isValido();
		this.tempoValidita = dataCreazione.plusYears(1);
		this.dataCreazione = dataCreazione;
		this.utente = utente;
		this.codiceId = utente.getCodiceId();
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
