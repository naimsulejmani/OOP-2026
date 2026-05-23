package introduction.abstraction.Good;

public class ShapeDemo {
    static void main() {
     try {
         Shape s1 = new Circle(10);
         Shape s2 = new Square(10);

//         Shape s3 = new Shape2D();

         callShape(s1);
         callShape(s2);

     } catch (IllegalArgumentException e) {
         System.out.println("Error: " + e.getMessage());
         System.out.println("Please enter a positive radius");
     }

//        Shape sh = new Shape();
    }

    public static void callShape(Shape shape) {
        shape.draw();
        System.out.println("Area=" + shape.area());
        System.out.println("Perimeter=" + shape.perimeter());
    }
}
