package introduction.abstraction.det_provimi;

public abstract class Base {

    public Base() {
        System.out.println("Base constructor called!");
    }

    public abstract void fun();

    public void fun1() {
        System.out.println("Base fun1() called!");
    }
}
