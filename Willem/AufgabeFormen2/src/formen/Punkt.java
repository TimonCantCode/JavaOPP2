package formen;


/**
 * This abstract Class provides two fields x and y for the subclasses
 */
abstract public class Punkt implements Comparable<Punkt> {
	double x;
	double y;
	
	public Punkt(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	abstract public double getUmfang();
	
	abstract public double getFlaeche();
	
	public String toString() {
		return "Punkt: " + x + y;
	}
	
	@Override
	public int compareTo(Punkt o) {
		return Double.compare(this.getFlaeche(), o.getFlaeche());
	}
	
	

}
