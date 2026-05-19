package introduction.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountLineOfFiles {
    static void main() {
        int counter = countLines("files/emrat.txt");
        System.out.println("Number of lines: " + counter);
    }

    public static int countLines(String fileName) {
        int counter = 0;
        Scanner reader = null;
        try {
            reader = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace(); //shtype qysh ka ndodhe gabimi si trace....
        }

        String line;
        while (reader.hasNextLine()) {
            counter++;
            line = reader.nextLine();
            System.out.println(line);
        }
        return counter;
    }
}
