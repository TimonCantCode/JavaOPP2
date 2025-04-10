package formen;

/**
 * this class represents a rectangle and is a subclass of square
 */
public class Rechteck extends Quadrat {
	
	double deltay;
	
	/**
	 * the constructor creates a starting point and needs two length parameters 
	 * @param x
	 * @param y
	 * @param deltax
	 * @param deltay
	 */
	public Rechteck(double x, double y, double deltax, double deltay) {
		super(y, x, deltax);
		this.deltay = deltay;
	}
	
	/**
	 * returns the area of the rectangle
	 * @return double
	 */
	public double getFlaeche() {
		return (2*deltax)*(2*deltay);
	}
	
	/**
	 * returns the circumference of the rectangle
	 * @return double
	 */
	@Override
	public double getUmfang() {
		return 4 * deltax + 4 * deltay;
	}
	
	@Override
	public String toString() {
		return "Rechteck: " + "X: " + x + " Y: " + y + " deltaX: " + this.deltax +  " deltaY: " + this.deltay;
	}

}
