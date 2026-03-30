package introduction.enumrators;

import java.util.Scanner;

public class MonthOldDemo {
    static void main() {

        System.out.println("Zgjedh njerin nga keto muaj:");
        Month[] months = Month.values();
        for (Month month : months) {
            System.out.printf("- %s%n", month);
        }

        Scanner reader = new Scanner(System.in);
        String selectedMonth = reader.nextLine().trim().toUpperCase();

        System.out.println(Month.valueOf(selectedMonth));


        int x = 3;


        switch (x) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;

        }

        Month month = Month.valueOf(selectedMonth);

        switch (month) {
            case JAN:
                System.out.println("Jan");
            case FEB:
                System.out.println("Feb");
                break;
            default:
                System.out.println("Nje muaj tjeter");
                break;

        }

        switch (month) {
            case JAN-> System.out.println("Jan");
            case FEB -> {
                System.out.println("Feb");
            }
            case MAR,APR -> {
                System.out.println("Mar/Apr");
            }
            default ->
                System.out.println("Nje muaj tjeter");

        }


    }
}
