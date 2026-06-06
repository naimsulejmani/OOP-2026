package introduction.nested_class.statics;

public class OuterDemo {
    static void main() {
        Outer outer = new Outer();

        Outer.StaticNested staticNested = new Outer.StaticNested();

        //object
        var obj = Outer.createNewInstanceStaticPrivateNested();
    }
}
