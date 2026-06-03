package mostra_provimi;

public class Shoferi extends Person {
    private String licenseNumber;
    private int yearsOfExperience;

    public Shoferi(String name, int age, String licenseNumber, int yearsOfExperience) {
        super(name, age);
        this.licenseNumber = licenseNumber;
        this.yearsOfExperience = yearsOfExperience;
    }
}
