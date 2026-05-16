package introduction.inheritance.aviary;

public class FlyingBird extends Bird {
    protected int height;
    public FlyingBird(String call, String color, String food) {
        super(call, color, food, MovementType.FLYING);
    }

    @Override
    public void setMovement(MovementType movement) {
        System.out.println("Cannot change!");
    }

    @Override
    public String toString() {
        return "FlyingBird{" + super.toString() + "}";
    }
}
