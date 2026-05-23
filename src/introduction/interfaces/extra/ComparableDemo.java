package introduction.interfaces.extra;

public class ComparableDemo {
    static void main() {
        Vehicle mercedes = new Vehicle(120, 20000);
        Vehicle bmw = new Vehicle(150, 25000);
        Vehicle vehicle3 = new Vehicle(130, 22000);

        FutballTeam realMadrid = new FutballTeam(1, "Real Madrid", 15);
        FutballTeam barcelona = new FutballTeam(2, "Barcelona", 5);
        FutballTeam paris = new FutballTeam(3, "Paris", 1);

        System.out.println(realMadrid.compareTo(barcelona) > 0);
        System.out.println(mercedes.compareTo(bmw) > 0);




    }
}
