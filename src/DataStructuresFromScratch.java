import structures.BinaryCompare;
import structures.BinaryTree;
import structures.LinkedList;
import structures.Queue;
import structures.Stack;
import utils.Printer;

public class DataStructuresFromScratch {
    private void testTree() {
        BinaryCompare<Integer> compare = (p1, p2) -> {
            return p1 == p2 ? 0 : p1 > p2 ? -1 : 1;
        };
        BinaryTree<Integer> myTree = new BinaryTree<Integer>(compare);
        myTree.add(5);
        myTree.add(2);
        myTree.add(10);
        myTree.add(15);
        myTree.add(12);
        myTree.add(13);
        myTree.add(1);
        myTree.add(3);
        Printer printer = new Printer();
        printer.print(myTree.toString(), "Tree");
    }

    private void testLinkedList() {
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

    private void testQueue() {
        Queue<Integer> myQueue = new Queue<>();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        // myQueue.dequeue();
        Printer printer = new Printer();
        printer.print(myQueue.toString(), "Queue");
    }

    private void testStack() {
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
