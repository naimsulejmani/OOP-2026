package introduction.summary_chapter8;

import java.util.ArrayList;

public class GoodStack {
    private ArrayList<Object> stack = new ArrayList<>();

    public void push(Object o) {
        stack.add(o);
    }

    public Object pop() {
        return stack.remove(stack.size() - 1);
    }

    public int size() {
        return stack.size();
    }
}
