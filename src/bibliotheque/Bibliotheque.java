package bibliotheque;

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

	public void ajouterOuvrage(Ouvrage ouvrage) {
		if (nbOuvrages < nbOuvragesMax) {
			ouvrages[nbOuvrages] = ouvrage;
			nbOuvrages++;
		}
	}

}
