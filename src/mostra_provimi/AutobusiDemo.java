package mostra_provimi;

public class AutobusiDemo {
    public static void main(String[] args) {
        try {
            Autobusi autobusi = new Autobusi(50, 1, 2020, 2000, false);
           Pasagjeri pasagjeri1 = new Pasagjeri("John Doe", 30, "T123", "City A");
           Kondukteri kondukteri1 = new Kondukteri("Jane Smith", 40, "E456", 10);
           Shoferi shoferi1 = new Shoferi("Bob Johnson", 50, "S789", 15);
           autobusi.addPasagjer(pasagjeri1);
           autobusi.setKondukteri(kondukteri1);
           autobusi.setShoferi(shoferi1);
            System.out.println("Autobusi created successfully!");
        } catch (VehicleOldException e) {
            System.out.println(e.getMessage());
        }
    }
}
