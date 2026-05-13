package introduction.inheritance.aviary;

public class Ostrich extends WalkingBird {
    public Ostrich(String call, String color, String food) {
        super(call, color, food);
    }

    @Override
    public String toString() {
        return "Ostrich{" + super.toString() + "}";
    }
}
