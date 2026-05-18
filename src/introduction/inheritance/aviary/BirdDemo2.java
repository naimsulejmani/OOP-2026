package introduction.inheritance.aviary;

public class BirdDemo2 {
    static void main() {
        Bird bird1 = new TalkingParrot("Hello!", "Green", "Seeds", new String[]
                {"Hi", "Hello", "Hey"});
        Bird bird2 = new Goose("Honking", "White", "Grass");
        Bird bird3 = new Ostrich("Booming", "Brown", "Plants");

        testObject(bird2);

    }

    public static void testBird(Bird bird) {
        System.out.println(bird.getClass().getSimpleName());
        System.out.println(bird.getCall());
        System.out.println(bird.toString());
    }

    public static void testObject(Object object) {
        System.out.println(object.getClass().getSimpleName());
        System.out.println(object.toString());
    }
}






