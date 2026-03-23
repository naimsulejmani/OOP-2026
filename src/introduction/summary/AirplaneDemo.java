package introduction.summary;

public class AirplaneDemo {
    static void main() {
        Airplane airplane1 = new Airplane(200, 800);
        Airplane airplane2 = new Airplane(150, 600);
        Airplane airplane3 = new Airplane(-150, -5000);
        Airplane airplane4 = new Airplane();
        airplane4.setCapacity(200);
        airplane4.setSpeed(-700);
        airplane1.setCapacity(250);

        System.out.println(airplane1.toString());
        System.out.println(airplane2.toString());
        System.out.println(airplane3.toString());
        System.out.println(airplane4.toString());
    }
}
