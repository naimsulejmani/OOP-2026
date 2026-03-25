package introduction.enumrators;

public class MonthDemo {
    static void main() {


        System.out.println(Month.DEC.toString());

        System.out.println(Month.DEC == Month.JAN); //ktu jan dy barazime = = te ngjitura ==
        System.out.println(Month.JAN == Month.JAN);
        System.out.println(Month.FEB == Month.valueOf("FEB"));
        System.out.println(Month.JAN.equals(Month.FEB));


        Month[] months = Month.values();
        for (Month month : months) {
            System.out.println(month);
        }

        System.out.println("Total months: " + months.length);
        System.out.println(Month.values()[1]);
        System.out.println(Month.JUN.ordinal());
        System.out.println(Month.JUN.compareTo(Month.APR));
        System.out.println(Month.JUN.compareTo(Month.JUN));
        System.out.println(Month.JUN.compareTo(Month.DEC));

    }
}
