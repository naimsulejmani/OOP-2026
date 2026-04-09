package introduction.pass_test;

public class PassTest {
    public static void changePrimitive(int x) {
        x++;
        System.out.println("Inside changePrimitive x is " + x);
    }

    public static void changeDay(MyData data, int day) {
        System.out.println("Inside changeDay before changing day is " + data.getDay());
        data.setDay(day);
        System.out.println("Inside changeDay after changing day is " + data.getDay());
    }

    public static void changeData(MyData data) {
        data = new MyData(2, 2, 2002);
        System.out.println("Inside changeData day is " + data.getDay());
    }

    public static void swapAddress(MyData dt1, MyData dt2) {
        dt1 = dt2;
        System.out.println("Inside swapAddress day is " + dt1.getDay());
    }

    static void main() {
        int x = 10;
        System.out.println("Before calling changePrimitive x is " + x);
        changePrimitive(x);
        System.out.println("After calling changePrimitive x is " + x);

        MyData dt1 = new MyData(1, 1, 2000);
        System.out.println("Before calling changeDay day is " + dt1.getDay());
        changeDay(dt1, 20);
        System.out.println("After calling changeDay day is " + dt1.getDay());
        changeData(dt1);
        System.out.println("After calling changeData day is " + dt1.getDay());

        swapAddress(dt1, new MyData(3, 3, 2003));
        System.out.println("After calling swapAddress day is " + dt1.getDay());
    }
}
