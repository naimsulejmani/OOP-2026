package introduction.abstraction.Good;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side must be positive in order to create a Square!");
        }
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square");
        System.out.println("____");
        System.out.println("|  |");
        System.out.println("|__|");
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}
