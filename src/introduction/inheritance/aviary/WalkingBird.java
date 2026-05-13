package introduction.inheritance.aviary;

public class WalkingBird extends Bird {

    public WalkingBird(String call, String color, String food) {
        super(call, color, food, MovementType.WALKING);
    }

    @Override
    public String toString() {
        return "WalkingBird{" + super.toString() + "}";
    }

    @Override
    public void setMovement(MovementType movement) {
        System.out.println("Cannot change movement!");
    }
}
