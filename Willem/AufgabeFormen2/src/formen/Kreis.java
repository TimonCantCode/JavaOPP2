package formen;

/**
 * this class represents a circle 
 */
public class Kreis extends Punkt{
	
	double radius;
	
	/**
	 * the constructor needs a starting point and a radius of the circle
	 * @param x
	 * @param y
	 * @param radius
	 */
	public Kreis(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	
	/**
	 * returns the circumference of the circle
	 * @return double
	 */
	@Override
	public double getUmfang() {
		return 2 * Math.PI * radius;
	}
	
	/**
	 * returns the area of the circle 
	 * @return double
	 */
	public double getFlaeche() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public String toString() {
		return "Kreis: " +  x + " " + y + " " + this.radius;
	}

}
