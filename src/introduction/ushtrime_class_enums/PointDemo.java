package introduction.ushtrime_class_enums;

public class PointDemo {
    static void main() {
        Point p1 = new Point(2, 3);
        System.out.println(p1); // (2.0, 3.0)

        Point p2 = new Point();
        System.out.println(p2); // (0.0, 0.0)

        System.out.println(p1.distanceTo(p2));
        System.out.println(p2.distanceTo(p1));

        System.out.println(Point.distanceBetween(p1, p2));
    }
}
