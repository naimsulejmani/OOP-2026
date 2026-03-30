package introduction.ushtrime_class_enums;

public class Square {

    private double side = 1;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side <= 0){
            System.out.println("Side must be positive. Keeping the previous value: " + this.side);
            return;
        }
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public void print(){

        System.out.println("---");
        System.out.println("|  |");
        System.out.println("---");
    }

    public boolean isGreaterSquareThan(Square other) {
        return side > other.side;
    }



}














