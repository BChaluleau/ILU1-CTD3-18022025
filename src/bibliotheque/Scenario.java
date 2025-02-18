package bibliotheque;

public class Scenario {

	public static void main(String[] args) {

		Bibliotheque petiteBibliotheque = new Bibliotheque(10);

		Ouvrage ouvrage = new Ouvrage("LeTitre", "UnAuteur", "UnEditeur", 2025, "ISBN_12_34");

		Exemplaire exemplaire = new Exemplaire("COTE_1", true, false);

		ouvrage.ajouterExemplaire(exemplaire);
		petiteBibliotheque.ajouterOuvrage(ouvrage);
		System.out.println(petiteBibliotheque);

		System.out.println("...Fin...");
	}

}
