package com.epicode.classiprogetto;

import java.time.LocalDate;

import com.epicode.dao.TesseraDao;
import com.epicode.dao.UtenteDao;

public class Main {

	public static void main(String[] args) {
		
		Utente utente1 = new Utente("Eugenio", "Codella", 29, "HHR1033");
		Utente utente2 = new Utente("Florencia", "Perez", 38, "HHR1653");
		Utente utente3 = new Utente("Scott", "Allen", 44, "HHR1933");
		Utente utente4 = new Utente("Mario", "Micciche", 68, "HHR0193");
		Utente utente5 = new Utente("Micheal", "Schubert", 31, "HHR1763");
		UtenteDao utenti = new UtenteDao();
		utenti.save(utente1);
		utenti.save(utente2);
		utenti.save(utente3);
		utenti.save(utente4);
		utenti.save(utente5);
		
		Tessera tessera1 = new Tessera(LocalDate.now(), utente1);
		TesseraDao tessere = new TesseraDao(Tessera.class);
		tessere.save(tessera1);

	}

}