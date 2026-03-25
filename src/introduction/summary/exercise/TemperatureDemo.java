package introduction.summary.exercise;

public class TemperatureDemo {
    static void main() {
        Temperature temp1 = new Temperature(25);
        Temperature temp2 = new Temperature(-10);
        Temperature temp3 = new Temperature(150);
        Temperature temp4 = new Temperature();
        temp4.setCelsius(30);

        System.out.println(temp1.toString());
        System.out.println("---------------------");
        System.out.println(temp2.toString());
        System.out.println("---------------------");
        System.out.println(temp3.toString());
        System.out.println("---------------------");
        System.out.println(temp4.toString());
    }
}
