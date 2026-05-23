package introduction.interfaces;

import java.lang.reflect.InvocationTargetException;

public class ListenerDemo {

    static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        KeyEvent key = new KeyEvent(64, 'A');
        KeyListener listener = null;

        if (args == null || args.length == 0) {
            throw new IllegalArgumentException("No Argument for implementation provided!");
        }

        //Java Reflection -> Java Advance
        listener = (KeyListener) Class.forName(args[0]).getConstructor().newInstance();

//        if (args[0].equals("introduction.interfaces.ErlenetListener")) {
//            listener = new ErlenetListener();
//        } else if (args[0].equals("introduction.interfaces.MyListener")) {
//            listener = new MyListener();
//        } else {
//            throw new IllegalArgumentException("Unknown implementation provided!");
//        }

        testListener(listener, key);
    }

    public static void testListener(KeyListener listener, KeyEvent event) {
        listener.keyPressed(event);
        listener.keyReleased(event);
        listener.keyTyped(event);
    }

}
