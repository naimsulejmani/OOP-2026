package introduction.interfaces;

public class ErlenetListener implements KeyListener {
    @Override
    public void keyPressed(KeyEvent key) {
        System.out.printf("You have keypressed %s (%s)%n", key.getKeyChar(), key.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent key) {
        System.out.printf("You have keyreleased %s (%s)%n", key.getKeyChar(), key.getKeyCode());
    }

    @Override
    public void keyTyped(KeyEvent key) {
        System.out.printf("You have keytyped %s (%s)%n", key.getKeyChar(), key.getKeyCode());
    }
}
