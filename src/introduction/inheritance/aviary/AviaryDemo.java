package introduction.inheritance.aviary;

public class AviaryDemo {
    static void main() {
        Bird tBird = new TalkingParrot("Hello!", "Green", "Seeds",
                new String[] { "Hello", "Hi", "Hey","Bye","GoodBye","Tung","Welcome" });


        tBird.setFood("Fruits");
        System.out.println(tBird.getFood());
        tBird.setMovement(MovementType.WALKING);
        System.out.println(tBird.toString());

        System.out.println(tBird.equals(tBird));

        Object object = tBird;
        System.out.println(object.toString());
    }
}
