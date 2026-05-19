package introduction.polymorphism.instance_of_example;

public class CacttusEducation extends College {
    private int duration;
    public CacttusEducation(String id, String name, String address, int duration) {
        super(id, name, address);
        this.duration=duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
