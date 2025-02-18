package bibliotheque;

public class Ouvrage {

	private static int NB_MAX_EXEMPLAIRES = 100; // equivalent au #define

	private String titre;
	private String auteur;
	private String editeur;
	private int annee;
	private String iSBN;

	private int nbExemplaires = 0;
	private Exemplaire[] exemplaires;

	public Ouvrage(String titre, String auteur, String editeur, int annee, String iSBN) {
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
		this.annee = annee;
		this.iSBN = iSBN;
		exemplaires = new Exemplaire[NB_MAX_EXEMPLAIRES];
	}

	public String getTitre() {
		return titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public String getEditeur() {
		return editeur;
	}

	public int getAnnee() {
		return annee;
	}

	public String getiSBN() {
		return iSBN;
	}

	public int getNbExemplaires() {
		return nbExemplaires;
	}

	public Exemplaire[] getExemplaires() {
		return exemplaires;
	}

}
