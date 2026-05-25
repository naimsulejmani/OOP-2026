package introduction.interfaces.ushtrime;

public class Node<T> implements Comparable<Node<T>> {
    private T data;
    private Node<T> next;


    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node [data=" + data + ", next=" + next + "]";
    }

    @Override
    public int compareTo(Node<T> o) {
        return 0;
    }
}
