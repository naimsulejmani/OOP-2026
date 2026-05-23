package introduction.interfaces;

public class KeyEvent {
    public int keyCode;
    public char keyChar;

    public KeyEvent(int keyCode, char keyChar) {
        this.keyCode = keyCode;
        this.keyChar = keyChar;
    }

    public int getKeyCode() {
        return keyCode;
    }

    public void setKeyCode(int keyCode) {
        this.keyCode = keyCode;
    }

    public char getKeyChar() {
        return keyChar;
    }

    public void setKeyChar(char keyChar) {
        this.keyChar = keyChar;
    }
}
