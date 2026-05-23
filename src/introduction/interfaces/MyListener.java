package introduction.interfaces;

public class MyListener implements KeyListener {
    @Override
    public void keyPressed(KeyEvent key) {
        System.out.println("Key Pressed: " + key.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent key) {
        System.out.println("Key Released: " + key.getKeyChar());
    }

    @Override
    public void keyTyped(KeyEvent key) {
        System.out.println("Key Typed: " + key.getKeyChar());
    }
}
