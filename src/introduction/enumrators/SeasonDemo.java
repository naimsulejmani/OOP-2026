package introduction.enumrators;

import java.util.Scanner;

public class SeasonDemo {
    static void main() {
        Season currentSeason = Season.SPRING;
        System.out.println("Current season: " + currentSeason);

        Season cilaSezone = Season.valueOf("WINTER");
        System.out.println("Cila sezone: " + cilaSezone);
    }
}
