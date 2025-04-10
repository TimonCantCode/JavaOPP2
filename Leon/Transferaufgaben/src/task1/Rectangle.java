package task1;

public class Rectangle extends Square {

    private double deltaY;      // half the length of the second side

    public Rectangle(double x, double y, double deltax, double deltay) {
        super(y, y, deltax);
        this.deltaY = deltay;
    }

    public double getDeltaY() {
        return deltaY;
    }

    public void setDeltaY(double deltaY) {
        this.deltaY = deltaY;
    }

    @Override
    public double getUmfang() {
        return 2 * (getDeltaX() + deltaY);
    }

    @Override
    public double getFlaeche() {
        return 2 * getDeltaX() * deltaY;
    }

    @Override
    public String toString() {
        return " SeiteY=" + 2 * deltaY +
                super.toString();
    }

}
