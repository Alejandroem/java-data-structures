import structures.LinkedList;
import structures.Queue;
import utils.Printer;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // testLinkedList();
        testQueue();

    }

    private static void testQueue() {
        Queue<Integer> myQueue = new Queue<>();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        // myQueue.dequeue();
        Printer printer = new Printer();
        printer.print(myQueue.toString(), "Queue");
    }

    private static void testLinkedList() {
        LinkedList<String> myList = new LinkedList<>();
        myList.addFirst("C");
        myList.addFirst("B");
        myList.addFirst("A");
        myList.addLast("D");
        myList.addLast("F");
        myList.addLast("G");
        Printer printer = new Printer();
        printer.print(myList.toString(), "LinkedList");
    }
}
