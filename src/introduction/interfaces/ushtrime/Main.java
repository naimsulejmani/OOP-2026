package introduction.interfaces.ushtrime;

public class Main {
    static void main() {
        Node<Integer> nodeInt = new Node<>(10);
        Node<Integer> nodeInt2 = new Node<>(20);
        nodeInt.setNext(nodeInt2);

        System.out.println(nodeInt);

        PairOne<String> pair = new PairOne<>("Ekipi me i mire", "Real Madrid");
        System.out.println(pair);

        PairOne<Integer> pairInt = new PairOne<>(1, 2);

        Pair<Integer, String> pair1 = new Pair<>(1, "Real Madrid");
        Pair<String, Double> borxhi1 = new Pair<>("Erlenti", 500.0);
        Pair<String, String> borxhi2 = new Pair<>("Erlenti", "500 euro");
    }
}
