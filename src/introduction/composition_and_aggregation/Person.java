package introduction.composition_and_aggregation;

import java.time.LocalDate;

public class Person {
    private Brain brain = new Brain();
    private Heart heart = new Heart();
    private LocalDate birthDate = LocalDate.now();

    public Person() {
//        this.brain = new Brain();
//        this.heart = new Heart();
//        this.birthDate = LocalDate.now();
    }

    public Person(Brain brain, Heart heart, LocalDate birthDate) {
//        this();
        setBrain(brain);
        setHeart(heart);
        setBirthDate(birthDate);
    }

    public Brain getBrain() {
        return brain;
    }

    public void setBrain(Brain brain) {
        if (brain == null) {
            System.out.println("Brain cannot be null");
            return;
        }
        this.brain = brain;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        if (heart == null) {
            System.out.println("Heart cannot be null");
            return;
        }
        this.heart = heart;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        if (birthDate == null) {
            System.out.println("Birth date cannot be null");
            return;
        }
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "brain=" + brain +
                ", heart=" + heart +
                ", birthDate=" + birthDate +
                '}';
    }
}
