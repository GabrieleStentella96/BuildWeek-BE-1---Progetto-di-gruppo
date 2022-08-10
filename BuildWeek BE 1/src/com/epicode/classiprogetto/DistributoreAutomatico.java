package com.epicode.classiprogetto;

public class DistributoreAutomatico implements InterRivenditori{
	
	private boolean attivo;

	public DistributoreAutomatico(boolean attivo) {
		this.attivo = attivo;
	}

	public boolean isAttivo() {
		return attivo;
	}

	public void setAttivo(boolean attivo) {
		this.attivo = attivo;
	}

	@Override
	public void emissioneBiglietto() {
		
		
	}

	@Override
	public void emissioneAbbonamento() {
		
		
	}
	
	
	

}
