package task1;

public class Circel extends Point {

    private double radius;

    public Circel(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getFlaeche() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getUmfang() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return " Radius=" + radius +
                super.toString();
    }

}
