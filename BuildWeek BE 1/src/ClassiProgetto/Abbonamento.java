package ClassiProgetto;

import java.time.LocalDate;

public abstract class Abbonamento {
	
	private boolean valido;
	private int codiceId;
	private LocalDate dataEmissione;
	private String puntoEmissione;
	
	public Abbonamento(boolean valido, int codiceId, LocalDate dataEmissione, String puntoEmissione) {
		super();
		this.valido = valido;
		this.codiceId = codiceId;
		this.dataEmissione = dataEmissione;
		this.puntoEmissione = puntoEmissione;
	}

	public boolean isValido() {
		return valido;
	}

	public void setValido(boolean valido) {
		this.valido = valido;
	}

	public int getCodiceId() {
		return codiceId;
	}

	public void setCodiceId(int codiceId) {
		this.codiceId = codiceId;
	}

	public LocalDate getDataEmissione() {
		return dataEmissione;
	}

	public void setDataEmissione(LocalDate dataEmissione) {
		this.dataEmissione = dataEmissione;
	}

	public String getPuntoEmissione() {
		return puntoEmissione;
	}

	public void setPuntoEmissione(String puntoEmissione) {
		this.puntoEmissione = puntoEmissione;
	}

	@Override
	public String toString() {
		return "Abbonamento [isValido()=" + isValido() + ", getCodiceId()=" + getCodiceId() + ", getDataEmissione()="
				+ getDataEmissione() + ", getPuntoEmissione()=" + getPuntoEmissione() + "]";
	}
	
	

}
