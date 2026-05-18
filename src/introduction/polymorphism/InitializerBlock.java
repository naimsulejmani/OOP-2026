package introduction.polymorphism;

public final class InitializerBlock {

    private int x = 10;

    //static initializer block;
    static {
        System.out.println("Static block");
    }


    //instance intializer block;
    {
        while (x >= 0) {
            System.out.println("x = " + (x--));
        }
    }


    InitializerBlock() {
//        initilize();
        System.out.println("Constructor called x = " + x);
    }

//
//    private void initilize() {
//
//    }
    //instance intializer block
    {
        while (x < 10) {
            System.out.println("x = " + (x++));
        }
    }

    static void main() {
        new InitializerBlock();
    }

    public void setX(final int x) {
       // x++;
        System.out.println("x = " + x);
    }

}
