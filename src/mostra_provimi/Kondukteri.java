package mostra_provimi;

public class Kondukteri extends Person {
    private String employeeId;
    private int yearsOfExperience;

    public Kondukteri(String name, int age, String employeeId, int yearsOfExperience) {
        super(name, age);
        this.employeeId = employeeId;
        this.yearsOfExperience = yearsOfExperience;

    }


}



