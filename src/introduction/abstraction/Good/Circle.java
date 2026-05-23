package introduction.abstraction.Good;

public class Circle extends Shape {

    private double radius = 1.0;

    public Circle(double radius) {
        setRadius(radius);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
        System.out.println("o");
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        this.radius = radius;
    }

    public double diameter() {
        return 2 * radius;
    }
}
