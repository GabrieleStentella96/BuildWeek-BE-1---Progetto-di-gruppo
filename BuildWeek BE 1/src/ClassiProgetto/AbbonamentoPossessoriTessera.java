package ClassiProgetto;

import java.time.LocalDate;

public class AbbonamentoPossessoriTessera extends Abbonamento {

	private Validita validita;

	public AbbonamentoPossessoriTessera(boolean valido, int codiceId, LocalDate dataEmissione, String puntoEmissione, Validita validita) {
		super(valido, codiceId, dataEmissione, puntoEmissione);
		this.validita = validita;
	}

	@Override
	public String toString() {
		return "AbbonamentoPossessoriTessera [isValido()=" + isValido() + ", getCodiceId()=" + getCodiceId()
				+ ", getDataEmissione()=" + getDataEmissione() + ", getPuntoEmissione()=" + getPuntoEmissione()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	
}
