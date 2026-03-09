package introduction.summary;

public class DogDemo {
    static void main() {
        Dog dog1 = new Dog("Doberman", 23, "ashti");
        Dog dog3 = new Dog("Doberman", 23, "ashti");
        Dog dog2 = new Dog("Bandit", 24, "kukulla");

        System.out.println(dog1.compare(dog2));
        System.out.println(dog2.compare(dog1));

        System.out.println("ab".compareTo("ac"));


        System.out.println(dog1.getName());
        System.out.println(dog2.getName());

    }
}
