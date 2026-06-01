package introduction.records;

import java.util.Objects;

public class PersonR {
    private final String name;
    private final String surname;

    public PersonR(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PersonR personR = (PersonR) o;
        return Objects.equals(name, personR.name) && Objects.equals(surname, personR.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return "PersonR{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
