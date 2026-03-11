package introduction.summary;

public class Dog {
    //instance variable (object variable)
    private String name;
    private double weight;
    private String favouriteToy;

    //constructors
    public Dog() {
        //default constructor
    }

    public Dog(String name, double weight, String favouriteToy) {
        this.name = name;
        this.weight = weight;
        this.favouriteToy = favouriteToy;
    }

    public Dog(String favouriteToy, String name, double weight) {
        this.name = name;
        this.weight = weight;
        this.favouriteToy = favouriteToy;
    }

    public void fetch(String toy) {
        System.out.println("Fetched toy: " + toy);
    }

    public String getName() {
        return name;
    }

    public void makeFavouriteToy(String toy) {
        this.favouriteToy = toy;
    }

    public int compare(Dog anotherDog) {
        if (this.weight > anotherDog.weight)
            return 1;
        else if (this.weight < anotherDog.weight)
            return -1;
        else
            return 0;
    }


    public double getWeight() {
        return weight;
    }

    public String getFavouriteToy() {
        return favouriteToy;
    }
}
