package introduction.summary.exercise;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {
    }

    public Person(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Gabim! Nuk ka vjetor!");
            return;
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender == null || gender.isBlank()) {
            System.out.println("Gabim! Nuk ka gender!");
            return;
        }
        if (!gender.trim().toUpperCase().equals("M") && !gender.trim().toUpperCase().equals("F")) {
            System.out.println("Wrong gender!");
            return;
        }
        this.gender = gender.trim().toUpperCase();
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public boolean isTeen() {
        return age >= 13 && age < 18;
    }

    public boolean isSenior() {
        return age >= 65;
    }

    public boolean isChild() {
        return age < 13;
    }

    public String toString() {
        return String.format("Name: %s, Age: %d, Gender: %s, Adult: %b, Senior: %b, Child: %b, Teen: %b", name, age, gender, isAdult(), isSenior(), isChild(), isTeen());
    }
}
