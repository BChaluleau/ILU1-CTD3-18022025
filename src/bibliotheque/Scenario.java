package bibliotheque;

public class Scenario {

	public static void main(String[] args) {

		Bibliotheque petiteBibliotheque = new Bibliotheque(10);
		Bibliotheque grandeBibliotheque = new Bibliotheque(5000);

		Ouvrage ouvrage1 = new Ouvrage("LeTitre", "UnAuteur", "UnEditeur", 2025, "ISBN_12_34");

		Exemplaire exemplaire1 = new Exemplaire();

		System.out.println("...Fin...");
	}

}
