package introduction.nested_class.member;

public class OuterDemo {
    static void main() {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
    }
}
