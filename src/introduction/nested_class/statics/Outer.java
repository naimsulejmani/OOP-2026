package introduction.nested_class.statics;

public class Outer {
    //mundet me pas veti attribute, metoda, constructor

    private static int staticId = 100;
    private int id;

    {
        staticId = StaticNested.staticNestedId + 100;
    }

    public static class StaticNested {

        private static int staticNestedId = 200;

        //... mundet me pas veti attribute, metoda, constructor
        {
            Outer outer = new Outer();
            outer.id = staticId + 10;
        }
    }


    private static class StaticPrivateNested {
        //... mundet me pas veti attribute, metoda, constructor
    }

    public static StaticPrivateNested createNewInstanceStaticPrivateNested() {
        return new StaticPrivateNested();
    }
}
