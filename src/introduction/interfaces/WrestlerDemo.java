package introduction.interfaces;

public class WrestlerDemo {
    static void main() {
        Wrestler wrestler = new Kane();
        wrestler.paymentForWork(5);
        wrestler.themeMusic();
        wrestler.finisher();
    }
}
