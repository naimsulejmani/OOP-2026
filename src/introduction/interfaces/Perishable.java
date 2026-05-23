package introduction.interfaces;

import java.time.Period;

public interface Perishable {
    //constants
    public static final Period MAX_PERIOD = Period.ofDays(30);

    //abstract methods
    void perish();

    boolean isPerished();

    //default methods
    public default boolean verifyPeriod(Period p) {
        return comparePeriod(p) < 0;
    }

    // private methods
    private int comparePeriod(Period p) {
        return p.getDays() - MAX_PERIOD.getDays();
    }

    // static methods
    public static int getMaxPeriodDays() {
        return MAX_PERIOD.getDays();
    }

}
