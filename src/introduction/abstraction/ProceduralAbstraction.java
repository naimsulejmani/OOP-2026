package introduction.abstraction;

import java.util.Scanner;

public class ProceduralAbstraction {
    static void main() {
        String name = readString("Enter your name");
        System.out.println("Hello " + name);
        String color = readString("Enter your favorite color");
        System.out.println("Your favorite color is " + color);
        int age = readInt("Enter your age?");
        System.out.println("Your age is " + age);

        System.out.println("Your name is " + name + ", your favorite color is " + color + " and your age is " + age);
    }

    private static int readInt(String question) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(question);
//        return Integer.parseInt(scanner.nextLine());
        return 0;
    }

    private static String readString(String enterYourName) {
//        System.out.println(enterYourName);
//        return new Scanner(System.in).nextLine();
        return null;
    }
}
