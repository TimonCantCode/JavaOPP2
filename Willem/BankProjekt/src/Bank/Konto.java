package Bank;

public abstract class Konto {
	
	private int Kontonummer;
	private int Kontostand;
	
	public Konto(int nummer, int stand) {
		this.setKontonummer(nummer);
		this.setKontostand(stand);
	}
	
	public int getKontonummer() {
		return Kontonummer;
	}
	
	public void setKontonummer(int kontonummer) {
		Kontonummer = kontonummer;
	}

	public int getKontostand() {
		return Kontostand;
	}

	public void setKontostand(int kontostand) {
		Kontostand = kontostand;
	}
}
