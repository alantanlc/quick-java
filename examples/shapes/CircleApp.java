package examples.shapes;

public class CircleApp {

    public static void main(String[] args) {
        int size = 10;
        Circle c = new Circle(size);
        double area = c.area();
        System.out.printf(
            "The area of a circle " +
            "with radius %d is %7.2f",
            size, area);
    }
}

