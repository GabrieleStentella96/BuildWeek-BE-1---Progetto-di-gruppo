package com.epicode.classiprogetto;

public class Tram extends MezzoTrasporto {
	
	private int capienza;

	public Tram(boolean inservizio, int capienza) {
		super(inservizio, capienza);
		this.capienza = 40;
	}

}
