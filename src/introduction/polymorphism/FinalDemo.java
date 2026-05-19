package introduction.polymorphism;

public class FinalDemo {
    private final int x;
    private static final int y;

    //static initializer block
    static {
        y = 20;
    }

//initializer block
    {
        x = 10;
    }

//    public FinalDemo(int x) {
//        this.x = x;
//    }

    static void main() {

    }

    public void setX(final int x) {
        System.out.println(x);
    }
}
