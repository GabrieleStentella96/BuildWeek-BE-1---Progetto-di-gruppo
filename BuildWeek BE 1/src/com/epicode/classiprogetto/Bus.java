package com.epicode.classiprogetto;

public class Bus extends MezzoTrasporto {

	private int capienza;

	public Bus(boolean inservizio, int capienza) {
		super(inservizio, capienza);
		this.capienza = 25;
		
	}

	@Override
	public String toString() {
		return "Bus [isInservizio()=" + isInservizio() + ", getCapienza()=" + getCapienza() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
