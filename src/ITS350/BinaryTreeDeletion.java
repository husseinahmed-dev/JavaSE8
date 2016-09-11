package ITS350;

/**
 * Created by Hussein on 4/26/16.
 */
class TreeNode {
    public int iData;
    public TreeNode leftChild;
    public TreeNode rightChild;

}

class Tree {
    private TreeNode root;

    public Tree() {
        root = null;
    }

    public TreeNode find(int key) {
        TreeNode current = root;
        while (current.iData != key) {
            if (key < current.iData)
                current = current.leftChild;
            else
                current = current.rightChild;
            if (current == null)
                return null;
        }
        return current;
    }

    public void insert(int id) {
        TreeNode newNode = new TreeNode();
        newNode.iData = id;
        if (root == null)
            root = newNode;
        else {
            TreeNode current = root;
            TreeNode parent;
            while (true) {
                parent = current;
                if (id < current.iData) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void traverse() {
        inOrder(root);
    }

    public void inOrder(TreeNode localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.iData + " ");
            inOrder(localRoot.rightChild);
        }
    }

    public boolean delete(int key) {
        TreeNode current = root;
        TreeNode parent = root;
        boolean isLeftChild = true;

        while(current.iData != key) {
            parent = current;
            if (key < current.iData) {
                isLeftChild = true;
                current = current.leftChild;
            } else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null)
                return false;
        }

        // no child
        if (current.leftChild == null && current.rightChild == null) {
            if (current == root)
                root = null;
            else if (isLeftChild)
                parent.leftChild = null;
            else
                parent.rightChild = null;
        }
        // one child
        else if (current.rightChild == null)
            if (current == root)
                root = current.leftChild;
            else if (isLeftChild)
                parent.leftChild = current.leftChild;
            else
                parent.rightChild = current.leftChild;
        else if (current.leftChild == null)
            if (current == root)
                root = current.rightChild;
            else if (isLeftChild)
                parent.leftChild = current.rightChild;
            else
                parent.rightChild = current.rightChild;

        return false;
    }
}

public class BinaryTreeDeletion {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        tree1.insert(50);
        tree1.insert(60);
        tree1.insert(70);

        tree1.insert(40);
        tree1.insert(30);
        tree1.traverse();
        System.out.println();

        tree1.delete(40);
        tree1.traverse();
        System.out.println();
        tree1.delete(30);
        tree1.traverse();
        System.out.println();
    }
}
