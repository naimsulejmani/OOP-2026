package introduction.summary;

import java.time.LocalDate;

public class Date {
    //variablat instance
    private int year = 1;
    private int month = 1;
    private int day = 1;

    //constructros
    public Date() {
        //default constructors

    }

    public Date(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > LocalDate.now().getYear() + 1000 || year < LocalDate.now().getYear() - 1000) {
            System.out.println("Ke dhane vlere te gabuar, viti do te percaktohet si 2000");
            this.year = LocalDate.now().getYear();
        } else {
            this.year = year;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            this.month = LocalDate.now().getMonthValue();
        } else {
            this.month = month;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day < 1 || day > 31) {
            this.day = LocalDate.now().getDayOfMonth();
        } else {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                this.day = day;
            } else if (month != 2) {
                if (day > 30) {
                    System.out.println("Gabim do ta marrim diten 1");
                    this.day = 1;
                } else {
                    this.day = day;
                }
            } else {
                boolean leapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
                int maxDay = leapYear ? 29 : 28;
                if (day > maxDay) {
                    System.out.println("Gabim ....");
                    this.day = 1;
                } else {
                    this.day = day;
                }
            }


        }
    }

    public String toString() {
        return String.format("%d.%d.%d", day, month, year);
    }


}
