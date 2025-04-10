package task1;

abstract class Point implements Comparable<Point>, Cloneable {

    private double y;
    private double x;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    abstract public double getUmfang();
    abstract public double getFlaeche();

    public String toString() {
        return  " X=" + x +
                " Y=" + y +
                " Umfang=" + getUmfang() +
                " Flaeche=" + getFlaeche();
    }

    public int compareTo(Point obj) {
        return Double.compare(this.getFlaeche(), obj.getFlaeche());
    }

    public boolean equals(Point obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        return this.compareTo((Point) obj) == 0;
    }

    protected Point clone() throws CloneNotSupportedException {
        return (Point) super.clone();
    }

}
