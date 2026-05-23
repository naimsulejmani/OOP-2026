package introduction.abstraction.det_provimi;

public class Derived extends Base {

    public Derived() {
//        super();
        System.out.println("Derived constructor called!");
    }

    @Override
    public void fun() {
        System.out.println("Derived fun() called!");
    }
}
