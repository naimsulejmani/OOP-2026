package introduction.abstraction;

public class WrestlerDemo {
    static void main() {
        Wrestler.superTest();
        Wrestler wrestler = new Kane();
        wrestler.paymentForWork(10);
        wrestler.finisher();
        wrestler.themeMusic();
    }
}
