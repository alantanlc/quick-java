package examples.shapes;

public class Circle {
    private int radius;

    public Circle(int r) {
        radius = r;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
