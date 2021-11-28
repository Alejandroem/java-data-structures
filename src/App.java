import structures.LinkedList;
import utils.Printer;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        testLinkedList();

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
