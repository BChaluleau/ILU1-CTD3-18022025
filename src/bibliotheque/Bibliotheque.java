package bibliotheque;

public class Bibliotheque {

	private int nbOuvrages = 0;
	private int nbOuvragesMax;
	private Ouvrage[] ouvrages;

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

	public Ouvrage[] getOuvrages() {
		return ouvrages;
	}

}
