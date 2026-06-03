package mostra_provimi;

import java.time.LocalDate;

public class Autobusi {
    private int capacity;
    private int type;
    private int model;
    private int yearProduced;
    private boolean isElectric;

    private Kondukteri kondukteri;
    private Shoferi shoferi;
    private Pasagjeri[] pasagjeri;
    private int count = 0;



    public Autobusi(int capacity, int type, int model, int yearProduced, boolean isElectric) throws VehicleOldException {
        this.capacity = capacity;
        this.type = type;
        this.model = model;
        this.setYearProduced(yearProduced);
        this.isElectric = isElectric;
        this.pasagjeri = new Pasagjeri[capacity];

    }

    public Autobusi() {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getYearProduced() {
        return yearProduced;
    }

    public void setYearProduced(int yearProduced) throws VehicleOldException {
//        if (yearProduced < LocalDate.now().getYear()-10) {
//            throw new IllegalArgumentException("Year produced cannot be older than 10 years!");
//        }
        if (yearProduced < LocalDate.now().getYear()-10) {
            throw new VehicleOldException("Year produced cannot be older than 10 years!");
        }

        this.yearProduced = yearProduced;


    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public Kondukteri getKondukteri() {
        return kondukteri;
    }

    public void setKondukteri(Kondukteri kondukteri) {
        this.kondukteri = kondukteri;
    }

    public Shoferi getShoferi() {
        return shoferi;
    }

    public void setShoferi(Shoferi shoferi) {
        this.shoferi = shoferi;
    }

    public Pasagjeri[] getPasagjeri() {
        return pasagjeri;
    }

    public int getCount() {
        return count;
    }


    public void addPasagjer(Pasagjeri pasagjeri) {
        if (count < capacity) {
            this.pasagjeri[count] = pasagjeri;
            count++;
        } else {
            System.out.println("Bus is full. Cannot add more passengers.");
        }
    }

    public void removePasagjer(Pasagjeri pasagjeri) {

    }

    public boolean isFull() {
        return count >= capacity;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean hasFreeSeats() {
        return count < capacity;
    }

    public int getFreeSeats() {
        return capacity - count;
    }

    public void printPasagjeri() {
        for (int i = 0; i < count; i++) {
            System.out.println(pasagjeri[i]);
        }
    }



    @Override
    public String toString() {
        return "Autobusi [capacity=" + capacity + ", type=" + type + ", model=" + model + ", yearProduced=" + yearProduced + ", isElectric=" + isElectric +"]";
    }
}
