package Bank;

public class Sparkonto extends Konto{

	private float Zinsen;
	
	public Sparkonto(int nummer, int stand, float zinsen) {
		super(nummer, stand);
		this.setZinsen(zinsen);
		
	}

	public float getZinsen() {
		return Zinsen;
	}

	public void setZinsen(float zinsen) {
		Zinsen = zinsen;
	}

}
