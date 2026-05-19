package introduction.exceptions;

public class AddArgumentsTry2 {
    public static void main(String[] args) {
        args = new String[]{"1", "2", "tre", "3"};

        int sum = 0;
        for (String arg : args) {
            try {
                sum += Integer.parseInt(arg);
            } catch (NumberFormatException e) {
                System.out.println(arg + " is not a valid integer.");
            }
        }
        System.out.println("Sum = " + sum);


        System.out.println("Program completed.");

    }
}
