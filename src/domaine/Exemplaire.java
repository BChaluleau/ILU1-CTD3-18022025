package domaine;

public class Exemplaire {

	private String cote;

	private boolean disponible;
	private boolean enLigne;

	protected Exemplaire(String cote, boolean disponible, boolean enLigne) {
		// precondition
		assert disponible != enLigne; // asserts à activer en ajoutant -ea (enable assertions) à la ligne de run
		this.cote = cote;
		this.disponible = disponible;
		this.enLigne = enLigne;
		//
	}

	public String getCote() {
		return cote;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public boolean isEnLigne() {
		return enLigne;
	}

	@Override
	public String toString() {
		return "Exemplaire [cote=" + cote + "]";
	}

}
