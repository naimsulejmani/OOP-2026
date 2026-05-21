package introduction.summary_chapter8;

import java.util.ArrayList;

public class WrongStack extends ArrayList {
    public void push(Object o) {
        add(o);
    }
    public Object pop() {
        return remove(size() - 1);
    }
}
