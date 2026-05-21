package introduction.summary_chapter8;

public class WrongStackDemo {
    static void main() {
        WrongStack stack = new WrongStack();
        stack.push("Hello");
        stack.push("World");
        stack.addFirst("TEST");
        System.out.println(stack.pop());

    }
}
