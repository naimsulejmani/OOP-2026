package introduction.inheritance.aviary;

public class BirdDemo {
    static void main() {
        WalkingBird bird1 = new WalkingBird("hello", "white", "barishte");
        System.out.println(bird1.toString());


        TalkingParrot parrot1 = new TalkingParrot("Squack", "mix", "fruit"
                , new String[]{"looserLona", "barcadobet", "hey", "reali ma i miri", "reali champion"});
        System.out.println(parrot1.saySomething());


        Bird aBird = parrot1;
        Bird aBird2 = bird1;
        FlyingBird aFlyingBird = parrot1;
        Parrot aParrot = parrot1;
//        WalkingBird walkingBird = parrot1;
        Object aObjet = parrot1;

//        TalkingParrot parrot = new Bird("aa","bbb","ccc",MovementType.FLYING);
        TalkingParrot parrot = (TalkingParrot) aBird;
        System.out.println("aBird is convertet to parrot successfuly");
//        TalkingParrot parrot2 = (TalkingParrot) aBird2;
//        System.out.println("aBird2 is convertet to parrot successfuly");

        int x = 4;
        byte y = (byte) x;

        System.out.println("y = " + y);
    }
}














