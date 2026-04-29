package introduction.arraylist_collection;

import introduction.ushtrime_class_enums.Square;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ExampleOfArrayList {
    static void main() {
//        ArrayList listaKeqe = new ArrayList();//default 10 capacity
//        ArrayList listaKeqe1 = new ArrayList(1_000_000_000);
//
//        listaKeqe.add("Naim");
//        listaKeqe.add(1);
//        listaKeqe.add(true);
//        listaKeqe.add(new Square(4));
//        listaKeqe.add(new Scanner(System.in));
//
//        Object[] arrayiKeq = {"Naim", 1, true, new Square(4), new Scanner(System.in)};
//
//
//        int nr = (int)listaKeqe.get(0);

        ArrayList<String> emrat = new ArrayList<>();
        emrat.add("Naim");
        emrat.add("Erlent");
        emrat.add("Ardian");
        emrat.add("Endrit");
        emrat.add("Llupë");
        emrat.add("Naim");

        emrat.add("Naim");

        emrat.addFirst("Fidan");
        emrat.addLast("Dardan");
        emrat.add(2, "Test");
        emrat.removeFirst();
        emrat.removeLast();
        emrat.remove(2);
        emrat.remove("Erlent");


        System.out.println(emrat.contains("Naim"));
        System.out.println(emrat.indexOf("Naim"));
        System.out.println(emrat.lastIndexOf("Naim"));
        System.out.println(emrat.isEmpty());
        System.out.println(emrat.size());


        for(String emri: emrat) {
            System.out.println(emri);
        }


        System.out.println("-----------------------------------------");
        System.out.println("ITERATOR");
        System.out.println("-----------------------------------------");
        Iterator<String> iterator = emrat.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        emrat.clear();
        System.out.println(emrat.isEmpty());
        System.out.println(emrat.size());
        emrat.trimToSize();

    }


}
