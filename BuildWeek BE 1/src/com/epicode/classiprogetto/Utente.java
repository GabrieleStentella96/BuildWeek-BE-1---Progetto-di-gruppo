package com.epicode.classiprogetto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Utente {
	
	private String nome;
	private String cognome;
	private int eta;
@Id
	private String codiceId;
	
	

	public Utente() {
}

	public Utente(String nome, String cognome, int eta, String codiceId) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.codiceId = codiceId;
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public int getEta() {
		return eta;
	}


	public void setEta(int eta) {
		this.eta = eta;
	}


	public String getCodiceId() {
		return codiceId;
	}


	public void setCodiceId(String codiceId) {
		this.codiceId = codiceId;
	}
	
	@Override
	public String toString() {
		return "Utente [getNome()=" + getNome() + ", getCognome()=" + getCognome() + ", getEta()=" + getEta()
				+ ", getCodiceId()=" + getCodiceId() + "]";
	}
	

}
