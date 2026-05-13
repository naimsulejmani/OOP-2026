package introduction.inheritance.aviary;

public class Goose extends WalkingBird {
    public Goose(String call, String color, String food) {
        super(call, color, food);
    }

    @Override
    public String toString() {
        return "Goose{" + super.toString() + "}";
    }
}
