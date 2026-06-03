package mostra_provimi;

public class Pasagjeri extends Person {
    private String ticketNumber;
    private String destination;

    public Pasagjeri(String name, int age, String ticketNumber, String destination) {
        super(name, age);
        this.ticketNumber = ticketNumber;
        this.destination = destination;
    }
}
