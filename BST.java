import javax.swing.tree.TreeNode;

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

    // calculate size of BST
    int size() {
        return sizeRec(root);
    }

    // recursive method to calculate size
    int sizeRec(MyBinaryNode<T> root) {
        if (root == null)
            return 0;

        return 1 + sizeRec(root.left) + sizeRec(root.right);
    }
}

public class BST {

    public static void main(String[] args) {

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        bst.insert(56);

        bst.insert(30);
        bst.insert(70);

        bst.insert(22);
        bst.insert(40);
        bst.insert(60);
        bst.insert(95);

        System.out.println("Size: " + bst.size());

    }
}