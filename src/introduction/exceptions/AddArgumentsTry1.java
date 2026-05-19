package introduction.exceptions;

public class AddArgumentsTry1 {
    public static void main(String[] args) {
        args = new String[]{"1", "2", "tre", "3"};
        try {
            int sum = 0;
            for (String arg : args) {
                sum += Integer.parseInt(arg);
            }
            System.out.println("Sum = " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Error: One of the arguments is not a valid integer.");
            System.out.println("Exception message: " + e.getMessage());
        }

        System.out.println("Program completed.");

    }
}
