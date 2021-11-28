package structures;

import java.util.Stack;

class TreeNode<T> {
    T value;
    TreeNode<T> left;
    TreeNode<T> right;

    public TreeNode(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}

public class BinaryTree<T> {
    TreeNode<T> root;
    BinaryCompare<T> comparator;

    public BinaryTree(BinaryCompare<T> comparator) {
        root = null;
        this.comparator = comparator;
    }

    public void add(T value) {
        if (root == null) {
            root = new TreeNode<T>(value);
            return;
        }
        root = addRecursive(root, value);
    }

    public TreeNode<T> addRecursive(TreeNode<T> current, T value) {
        if (current == null) {
            return new TreeNode<T>(value);
        }
        if (comparator.call(current.value, value) < 0) {
            current.left = addRecursive(current.left, value);
        } else if (comparator.call(current.value, value) > 0) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    @Override
    public String toString() {
        String text = "digraph G {";

        Stack<TreeNode<T>> stack = new Stack<TreeNode<T>>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode<T> temp = stack.pop();
            if (temp.left != null) {
                text += temp.toString() + "->" + temp.left.toString() + "\n";
                stack.push(temp.left);
            }
            if (temp.right != null) {
                text += temp.toString() + "->" + temp.right.toString() + "\n";
                stack.push(temp.right);
            }
        }

        return text + "}";
    }

}
