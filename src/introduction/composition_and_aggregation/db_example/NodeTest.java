package introduction.composition_and_aggregation.db_example;

public class NodeTest {
    static void main() {
        Node node1 = new Node(1, null);
        Node node2  = new Node(2, node1);
//        node1.setNext(node2);
        System.out.println(node2);
//        while(node1.getNext()!=null) {
//            System.out.println(node1);
//            node1 = node1.getNext();
//        }
    }
}
