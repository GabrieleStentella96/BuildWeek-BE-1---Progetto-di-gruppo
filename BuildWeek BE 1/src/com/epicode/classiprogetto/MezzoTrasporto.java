package com.epicode.classiprogetto;

public abstract class MezzoTrasporto {

	private boolean inservizio;
	private int capienza;
	
	public MezzoTrasporto(boolean inservizio, int capienza) {
		super();
		this.inservizio = inservizio;
		this.capienza = capienza;
	}
	public boolean isInservizio() {
		return inservizio;
	}
	public void setInservizio(boolean inservizio) {
		this.inservizio = inservizio;
	}
	public int getCapienza() {
		return capienza;
	}
	public void setCapienza(int capienza) {
		this.capienza = capienza;
	}
	@Override
	public String toString() {
		return "MezzoTrasporto [isInservizio()=" + isInservizio() + ", getCapienza()=" + getCapienza() + "]";
	}
	
	
	
}
