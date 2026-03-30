package introduction.ushtrime_class_enums;

public class SquareDemo {
    static void main() {

        Square square = new Square(5);
        Square anotherSquare = new Square(3);
        square.print();
        anotherSquare.print();
        System.out.println("Is square greater than another square: " + square.isGreaterSquareThan(anotherSquare));


    }
}
