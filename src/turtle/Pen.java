package turtle;

public class Pen {
    private boolean isDown;

    public void penDown() {
        isDown = true;
    }

    public boolean IsDown() {
        return isDown;
    }

    public void penUp() {
        isDown = false;
    }
}
