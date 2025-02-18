package application;

import domaine.Bibliotheque;
import domaine.Genre;
import domaine.Ouvrage;

public class Scenario {

	public static void main(String[] args) {

		Bibliotheque petiteBibliotheque = new Bibliotheque(10);

		Ouvrage ouvrage = petiteBibliotheque.ajouterOuvrage("LeTitre", Genre.S, "UnAuteur", "UnEditeur", 2025,
				"ISBN_12_34");
		ouvrage.ajouterExemplaire("COTE_1", true, false);
		ouvrage.ajouterExemplaire("COTE_2", true, false);
		ouvrage.ajouterExemplaire("COTE_3", true, false);

		System.out.println(petiteBibliotheque);

		System.out.println("...Fin...");
	}

}
