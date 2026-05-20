package introduction.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ResourceAutoClosureExample {
    static void main() {

        if(false) {
            System.out.println("FALSE u ekzekutu");
        }

        if (true) {
            System.out.println("TRUE U ekzekutu");
        }
//        try (BufferedReader in = new BufferedReader(new FileReader("files/emrat.txt"));
//             PrintWriter out = new PrintWriter(new FileWriter("files/emrat_copy.txt"))) {
//            String line = in.readAllAsString();
//            out.println(line);
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
    }
}
