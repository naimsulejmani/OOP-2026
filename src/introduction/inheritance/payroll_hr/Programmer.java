package introduction.inheritance.payroll_hr;

import java.time.LocalDate;

public class Programmer extends SalariedEmployee {
    private String programmingLanguage;

    public Programmer(int id, String name, String surname, LocalDate dateOfBirth, LocalDate hireDate, double salary, double bonusPercentage, String programmingLanguage) {
        super(id, name, surname, dateOfBirth, hireDate, salary, bonusPercentage);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "Programmer{" + super.toString() + ", programmingLanguage=" + programmingLanguage + "}";
    }
}
