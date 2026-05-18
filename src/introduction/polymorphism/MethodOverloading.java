package introduction.polymorphism;

public class MethodOverloading {
    static void main() {
        int s1 = add(4, 5);
        int s2 = add(1, 2, 3);
        int s3 = add(1, 2, 3, 4, 5, 6, 7, 8);
        int s4 = add(1);
        int s5 = add();

        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }

    public static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
