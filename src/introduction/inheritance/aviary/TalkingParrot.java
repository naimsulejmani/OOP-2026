package introduction.inheritance.aviary;

public class TalkingParrot extends Parrot {
    private String[] words;

    public TalkingParrot(String call, String color, String food, String[] words) {
        super(call, color, food);
        this.words = words;
        height = 100;
    }

    @Override
    public void setFood(String food) {
        System.out.println("Food in Talking parrot!");
        super.setFood(food);
    }

    public String saySomething() {
        return words[(int) (Math.random() * words.length)];
    }

    public void fly() {
        System.out.println("Flying!!!");
    }

    @Override
    public String toString() {
        return "TalkingParrot{" + super.toString() + ", words=" + java.util.Arrays.toString(words) + "}";
    }

}
