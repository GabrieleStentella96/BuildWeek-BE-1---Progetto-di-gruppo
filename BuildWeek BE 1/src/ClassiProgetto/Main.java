package ClassiProgetto;

import Dao.UtenteDao;

public class Main {

	public static void main(String[] args) {
		
		Utente utente1 = new Utente("Eugenio", "Codella", 29, "HHR1033");
		Utente utente2 = new Utente("Florencia", "Perez", 38, "HHR1653");
		Utente utente3 = new Utente("Scott", "Allen", 44, "HHR1933");
		Utente utente4 = new Utente("Mario", "Micciche", 68, "HHR0193");
		UtenteDao utenti = new UtenteDao();
		utenti.save(utente1);
		utenti.save(utente2);
		utenti.save(utente3);
		utenti.save(utente4);
		

	}

}
