class MyBinaryNode<T extends Comparable<T>> {

    T key;
    MyBinaryNode<T> left, right;

    public MyBinaryNode(T key) {
        this.key = key;
        left = right = null;
    }
}

class BinarySearchTree<T extends Comparable<T>> {
    MyBinaryNode<T> root;

    BinarySearchTree() {
        root = null;
    }

    // method to insert node in BST
    void insert(T key) {
        root = insertRec(root, key);
    }

    // recursive method to insert node
    MyBinaryNode<T> insertRec(MyBinaryNode<T> root, T key) {
        if (root == null) {
            return new MyBinaryNode<>(key);
        }

        if (key.compareTo(root.key) < 0) {
            root.left = insertRec(root.left, key);
        } else if (key.compareTo(root.key) > 0) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }
}

public class BST {

    public static void main(String[] args) {

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        bst.insert(56);

        bst.insert(30);
        bst.insert(70);

    }
}