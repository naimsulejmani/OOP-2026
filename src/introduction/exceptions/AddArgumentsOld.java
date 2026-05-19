package introduction.exceptions;

public class AddArgumentsOld {
    public static void main(String[] args) {
        args = new String[]{"1", "2", "naim", "3"};
        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        System.out.println("Sum = " + sum);
    }
}
