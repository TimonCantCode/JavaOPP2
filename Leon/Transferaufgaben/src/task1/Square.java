package task1;

public class Square extends Point {
    private double deltaX;      // half the length of the first side

    public Square(double x, double y, double deltaX) {
        super(x, y);
        this.deltaX =deltaX;
    }

    public double getDeltaX() {
        return deltaX;
    }
    public void setDeltaX(double deltaX) {
        this.deltaX = deltaX;
    }

    @Override
    public double getUmfang() {
        return 2 * 4 *  deltaX;
    }
    @Override
    public double getFlaeche() {
        return 2 * deltaX * deltaX;
    }

    @Override
    public String toString() {
        return  " SeiteX=" + 2 * deltaX +
                super.toString();
    }

}
