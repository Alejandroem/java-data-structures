package structures;

class StackNode<T> {
    T value;
    StackNode<T> next;

    StackNode(T value) {
        this.value = value;
        this.next = null;
    }
}

public class Stack<T> {
    private StackNode<T> head;

    public Stack() {
        this.head = null;
    }

    public void push(T value) {
        if (head == null) {
            head = new StackNode<>(value);
            return;
        }
        StackNode<T> added = new StackNode<>(value);
        added.next = head;
        head = added;
    }

    public T pop() {
        T value = head.value;
        head = head.next;
        return value;
    }

    @Override
    public String toString() {
        String text = "digraph {" +
                "node [shape=record];" +
                "struct1 [label=\" ";

        StackNode<T> iterator = head;
        while (iterator.next != null) {
            text += " " + iterator.value + " | ";
            iterator = iterator.next;
        }

        text += iterator.value + " \"];}";
        return text;
    }
}
