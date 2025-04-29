package Bank;

public class Girokonto extends Konto {

	private int Kredit;
	
	public Girokonto(int nummer, int stand, int kredit) {
		super(nummer, stand);
		this.setKredit(kredit);
	}

	public int getKredit() {
		return Kredit;
	}

	public void setKredit(int kredit) {
		Kredit = kredit;
	}

}
