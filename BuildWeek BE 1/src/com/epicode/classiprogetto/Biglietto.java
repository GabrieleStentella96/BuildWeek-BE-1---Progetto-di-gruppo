package com.epicode.classiprogetto;

import java.time.LocalDate;

public class Biglietto extends Abbonamento {
	
	private boolean timbrato;

	public boolean isTimbrato() {
		return timbrato;
	}

	public void setTimbrato(boolean timbrato) {
		this.timbrato = timbrato;
	}

	public Biglietto(boolean valido, int codiceId, LocalDate dataEmissione, String puntoEmissione) {
		super(valido, codiceId, dataEmissione, puntoEmissione);
		this.timbrato = false;
		
		
	}

	@Override
	public String toString() {
		return "Biglietto [isValido()=" + isValido() + ", getCodiceId()=" + getCodiceId() + ", getDataEmissione()="
				+ getDataEmissione() + ", getPuntoEmissione()=" + getPuntoEmissione() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
