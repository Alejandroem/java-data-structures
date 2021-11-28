package structures;

class QueueNode<T> {
    T value;
    QueueNode<T> next;

    QueueNode(T value) {
        this.value = value;
        this.next = null;
    }
}

public class Queue<T> {
    QueueNode<T> head;
    QueueNode<T> tail;

    public Queue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(T value) {
        if (head == null) {
            head = new QueueNode<T>(value);
            tail = head;
            return;
        }
        tail.next = new QueueNode<T>(value);
        tail = tail.next;
    }

    public T dequeue() {
        T value = head.value;
        head = head.next;
        return value;
    }

    @Override
    public String toString() {
        String text = "digraph {" +
                "node [shape=record];" +
                "struct1 [label=\" ";

        QueueNode<T> iterator = head;
        while (iterator.next != null) {
            text += " " + iterator.value + " | ";
            iterator = iterator.next;
        }

        text += iterator.value + " \"];}";
        return text;
    }

}
