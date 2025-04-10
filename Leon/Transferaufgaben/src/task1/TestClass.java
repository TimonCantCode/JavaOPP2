package task1;

import java.util.ArrayList;

public class TestClass {
    public static void main(String [] args) throws CloneNotSupportedException {
         printData(createShapes());
    }

    private static ArrayList createShapes() {
        ArrayList<Point> shapes = new ArrayList<>();
        shapes.add(new Square(0, 0, 5));
        shapes.add(new Rectangle(0, 0, 5, 10));
        shapes.add(new Circel(0, 0, 5));
        shapes.add(new Square(0, 0, 3));
        shapes.add(new Rectangle(0, 0, 5, 10));
        shapes.add(new Circel(3,3,2));
        return shapes;
    }

    private static void printData(ArrayList<Point> shapes) throws CloneNotSupportedException {
        for (Point shape : shapes) {
            System.out.println(shape.getClass().getName() + shape.toString());
            System.out.println(shape.compareTo(shapes.get(1)));
            System.out.println(shape.equals(shapes.get(1)));
            Rectangle clone1 = (Rectangle) shapes.get(1).clone();
            System.out.println(clone1.getClass().getName() + clone1.toString());
            System.out.println(shape.getClass());
            System.out.println("-------------------------------------------------");
        }
    }
}
