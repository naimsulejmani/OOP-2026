package introduction.records;

//immutable
public record Person(String name, String surname) {
    //validim vazhdim i konstruktorit ne records
    public Person {
        if (name == null || surname == null) {
            throw new IllegalArgumentException("Name and surname cannot be null");
        }
    }
}
