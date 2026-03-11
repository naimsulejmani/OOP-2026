package introduction.summary;

public class CounterDemo {
    static void main() {

        Counter x = new Counter();
        Counter y = new Counter();
        Counter z = y;

        x.increment();
        System.out.println(x.getValue());
        System.out.println(y.getValue());
        System.out.println(z.getValue());

//        Counter tespiht = new Counter();
//        Counter ronaldoGoals = new Counter();
//        Counter fansCounter = new Counter();
//
//        tespiht.increment();
//        tespiht.increment();
//        tespiht.increment();
//        System.out.println(tespiht.getValue());
//
//        ronaldoGoals.increment();
//        ronaldoGoals.increment();
//        System.out.println(ronaldoGoals.getValue());

//        tespiht.MAX=100;

//        tespiht.MAX= 200;

    }
}
