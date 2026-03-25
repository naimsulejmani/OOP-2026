package introduction.summary.exercise;

public class Temperature {
    private double celsius;

    public Temperature() {
    }

    public Temperature(double celsius) {
        setCelsius(celsius);
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        if (celsius < -100 || celsius > 100) {
            System.out.println("Gabim! Vlera jashte rangut -100 deri 100!");
            return;
        }
        this.celsius = celsius;
    }

    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public double toKelvin() {
        return celsius + 273.15;
    }

    public String toString() {
        return String.format("%.2f C %n%.2f F %n%.2f K", celsius, toFahrenheit(), toKelvin());
    }
}
