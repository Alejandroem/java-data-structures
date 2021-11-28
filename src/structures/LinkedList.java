package structures;

class Node<T> {
    T value;
    public Node<T> next;
    public Node<T> prev;

    Node(T value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}

public class LinkedList<T> {
    Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    void addFirst(T value) {
        Node<T> added = new Node<T>(value);
        // List is empty we add first and last
        if (head == null) {
            head = added;
            return;
        }

        added.next = head;
        this.head = added;
    }

    void addLast(T value) {
        Node<T> added = new Node<T>(value);
        // List is empty we add first and last
        if (head == null) {
            head = added;
            return;
        }

        Node<T> iterator = head;
        while (iterator.next != null) {
            iterator = iterator.next;
        }
        iterator.next = added;
    }

}