package introduction.inheritance.aviary;

public class TalkingParrot extends Parrot {
    private String[] words;

    public TalkingParrot(String call, String color, String food, String[] words) {
        super(call, color, food);
        this.words = words;
    }

    public String saySomething() {
        return words[(int) (Math.random() * words.length)];
    }


    @Override
    public String toString() {
        return "TalkingParrot{" + super.toString() + ", words=" + java.util.Arrays.toString(words) + "}";
    }

}
