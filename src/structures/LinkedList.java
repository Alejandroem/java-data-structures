package structures;

class LinkedListNode<T> {
    T value;
    public LinkedListNode<T> next;
    public LinkedListNode<T> prev;

    LinkedListNode(T value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}

public class LinkedList<T> {
    LinkedListNode<T> head;

    public LinkedList() {
        this.head = null;
    }

    public void addFirst(T value) {
        LinkedListNode<T> added = new LinkedListNode<T>(value);
        // List is empty we add first and last
        if (head == null) {
            head = added;
            return;
        }

        added.next = head;
        this.head = added;
    }

    public void addLast(T value) {
        LinkedListNode<T> added = new LinkedListNode<T>(value);
        // List is empty we add first and last
        if (head == null) {
            head = added;
            return;
        }

        LinkedListNode<T> iterator = head;
        while (iterator.next != null) {
            iterator = iterator.next;
        }
        iterator.next = added;
    }

    @Override
    public String toString() {
        String graph = "digraph {";
        LinkedListNode<T> iterator = head;
        while (iterator.next != null) {
            graph += " " + iterator.value + " -> ";
            iterator = iterator.next;
        }
        graph += " " + iterator.value + " }";
        return graph;
    }

}
