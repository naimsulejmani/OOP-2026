package introduction.inheritance.aviary;

public class Owl extends FlyingBird {
    public Owl(String call, String color, String food) {
        super(call, color, food);
    }

    @Override
    public String toString() {
        return "Owl{" + super.toString() + "}";
    }
}
