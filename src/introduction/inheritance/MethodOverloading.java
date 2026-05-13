package introduction.inheritance;

public class MethodOverloading  {
    static void main() {
        var x = add(30,20);
        var y = add(30.5,20.5);
        var z = add(30,1L);

        System.out.println(new MethodOverloading());
    }

    public static long add(int a1, long b1 ) {
        return a1 + b1;
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}
