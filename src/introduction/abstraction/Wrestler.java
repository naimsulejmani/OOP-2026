package introduction.abstraction;

public abstract class Wrestler {
    //abstract class -> nuk mundemi me kriju instance
    // abstract methods -> femija duhet me implementu patjeter nese don me qene klase konkrete
    //abstract class -> mundet me pas variabla isntance, construcotr, metoda konkrete(metoda me implement apo trup) edhe metoda abstract

    public void paymentForWork(int hours){
        System.out.println("Payment for work: " + hours * 100);
        System.out.println();
    }

    public abstract void finisher();
    public abstract void themeMusic();

    public final void test(){
        System.out.println("test test test");
    }

    public static void superTest() {
        System.out.println("Super test can be called even without creating object!");
    }
}
