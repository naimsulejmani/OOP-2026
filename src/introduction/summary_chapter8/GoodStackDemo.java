package introduction.summary_chapter8;

public class GoodStackDemo {
    static void main() {
        GoodStack stack = new GoodStack();
        stack.push("Hello");
        stack.push("World");
        // stack.addFirst("TEST"); // This line would cause a compile-time error

        System.out.println(stack.pop());
    }
}
