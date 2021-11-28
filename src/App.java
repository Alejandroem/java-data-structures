import sorting.Sorting;
import structures.BinaryCompare;
import structures.BinaryTree;
import structures.LinkedList;
import structures.Queue;
import structures.Stack;
import utils.Printer;

public class App {

    public static void main(String[] args) {
        int arr[] = { 3, 6, 1, 9, 8, 7 };
        Sorting sorting = new Sorting();
        sorting.quickSort(arr, 0, arr.length - 1);

        // testTree();
        // testLinkedList();
        // testQueue();
        // testStack();

    }

    private static void testTree() {
        BinaryCompare<Integer> compare = (p1, p2) -> {
            return p1 == p2 ? 0 : p1 > p2 ? -1 : 1;
        };
        BinaryTree<Integer> myTree = new BinaryTree<Integer>(compare);
        myTree.add(5);
        myTree.add(2);
        myTree.add(10);
        myTree.add(15);
        myTree.add(12);
        myTree.add(1);
        myTree.add(3);
        Printer printer = new Printer();
        printer.print(myTree.toString(), "Tree");
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

    private static void testStack() {
        Stack<String> myStack = new Stack<>();
        myStack.push("A");
        myStack.push("B");
        myStack.pop();
        myStack.push("B");
        myStack.push("C");
        Printer printer = new Printer();
        printer.print(myStack.toString(), "Stack");

    }
}
