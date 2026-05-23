package introduction.interfaces;

public class Kane implements Wrestler {
    @Override
    public void paymentForWork(int hours) {
        System.out.println("Kane's payment for work: $" + hours * 100);
        System.out.println();
    }

    @Override
    public void themeMusic() {
        System.out.println("Kane's theme music: 'Burn It Down' by CFO$");
        System.out.println();
    }

    @Override
    public void finisher() {
        System.out.println("Kane's finisher: Rake It In");
        System.out.println();
    }
}
