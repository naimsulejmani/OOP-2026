package introduction.composition_and_aggregation.online;

public class SimulateGame {
    static void main() {
        Bomber b52 = new Bomber();
        AntiAircraftGun s300 = new AntiAircraftGun();

        s300.setTarget(b52);
        b52.setTarget(s300);

        for (int i = 0; i < 3; i++) {
            b52.attack();
            if (b52.getHealth() == 0) {
                System.out.println("Bomber is destroyed!");
                break;
            }
            b52.move(1,1);
            s300.attack();

            if (s300.getHealth() == 0) {
                System.out.println("Bomber is destroyed!");
                break;
            }


        }

        System.out.println(b52);
        System.out.println(s300);
    }
}
