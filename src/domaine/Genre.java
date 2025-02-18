package domaine;

public enum Genre {
	R("roman"), RP("roman policier"), SF("sf"), T("trou"), S("saucisse");

	private String affichage;

	private Genre(String affichage) {
		this.affichage = affichage;
	}

	@Override
	public String toString() {
		return affichage;
	}

}
