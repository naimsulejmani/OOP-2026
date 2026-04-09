package introduction.pass_test;

import java.util.Scanner;

public class CupDemo {
    public static void fillCup(Cup cup){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to fill the cup with?");
        cup.liquids = scanner.nextLine();
    }

    public static void fillAnotherCup(Cup cup) {
        cup = new Cup();
        fillCup(cup);
    }

    static void main() {
        Cup cup = new Cup();
        fillAnotherCup(cup);
        System.out.println("The cup is filled with: " + cup.liquids);
    }
}
