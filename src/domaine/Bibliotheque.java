package domaine;

import java.util.Arrays;

public class Bibliotheque {

	private int nbOuvrages = 0;
	private int nbOuvragesMax; // injecté par constructeur
	private Ouvrage[] ouvrages; // instancié dans le constructeur

	public Bibliotheque(int nbOuvragesMax) {
		this.nbOuvragesMax = nbOuvragesMax;
		ouvrages = new Ouvrage[nbOuvragesMax]; // VLA, vilain en C, pas de pb en Java
	}

	public int getNbOuvrages() {
		return nbOuvrages;
	}

	public int getNbOuvragesMax() {
		return nbOuvragesMax;
	}

	@Override
	public String toString() {
		return "Bibliotheque [nbOuvrages=" + nbOuvrages + ", ouvrages=" + Arrays.toString(ouvrages) + "]";
	}

	private void ajouterOuvrage(Ouvrage ouvrage) {
		if (nbOuvrages < nbOuvragesMax) {
			ouvrages[nbOuvrages] = ouvrage;
			nbOuvrages++;
		}
	}

	public Ouvrage ajouterOuvrage(String titre, Genre genre, String auteur, String editeur, int annee, String iSBN) {
		Ouvrage nouvelOuvrage = new Ouvrage(titre, genre, auteur, editeur, annee, iSBN);
		ajouterOuvrage(nouvelOuvrage);
		return nouvelOuvrage;
	}

}
