package introduction.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadOneLineOfTheFile {
    static void main() {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("files/emrat.txt"));
            String line = in.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (java.io.IOException e) {
                    System.out.println("Error closing the file: " + e.getMessage());
                }
            }
        }
    }
}
