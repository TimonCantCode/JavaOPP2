package formen;

/**
 * This class represents a Square
 * @param <T>
 */
public class Quadrat extends Punkt {
	
	private static final long serialVersionUID = 3289250931201297340L;
	double deltax;
	
	/**
	 * this Constructor creates a starting Point, where the square begins and
	 * needs a length parameter
	 * @param x
	 * @param y
	 * @param deltax represents only the half of a side 
	 */
	public Quadrat(double x, double y, double deltax) {
		super(x,y);
		this.deltax = deltax;
	}
	
	/**
	 * returns the circumference of the circle
	 * @return double
	 */
	@Override
	public double getUmfang() {
		return 8*deltax;
	}

	@Override
	public double getFlaeche() {
		return (2*deltax)*(2*deltax);
	}
	
	@Override
	public String toString() {
		return "Quadrat: " + "X: " + x + " " + "Y: " + y + " " + "deltaX: " + this.deltax;
	}




}
