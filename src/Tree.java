///**
// * Created by Hussein on 4/26/16.
// */
//class Node {
//    public int iData;
//    public double dData;
//    public Node leftChild;
//    public Node rightChild;
//
//    public void displayNode() {
//        System.out.println("{" + iData + ", " + dData + "} ");
//    }
//}
//
//class Tree {
//    private Node root;
//
//    public Tree() {
//        root = null;
//    }
//
//    public Node find(int key) {
//        Node current = root;
//        while (current.iData != key) {
//            if (key < current.iData)
//                current = current.leftChild;
//            else
//                current = current.rightChild;
//            if (current == null)
//                return null;
//        }
//        return current;
//    }
//
//    public void insert(int id, int dd) {
//        Node newNode = new Node();
//        newNode.iData = id;
//        newNode.dData = dd;
//        if (root == null)
//            root = newNode;
//        else {
//            Node current = root;
//            Node parent;
//            while (true) {
//                parent = current;
//                if (id < current.iData) {
//                    current = current.leftChild;
//                    if (current == null) {
//                        parent.leftChild = newNode;
//                        return;
//                    }
//                } else {
//                    current = current.rightChild;
//                    if (current == null) {
//                        parent.rightChild = newNode;
//                        return;
//                    }
//                }
//            }
//        }
//    }
//
//    public void preOrder(Node localRoot) {
//        if (localRoot != null) {
//            System.out.print(localRoot.iData + " ");
//            preOrder(localRoot.leftChild);
//            preOrder(localRoot.rightChild);
//        }
//    }
//
//    public void inOrder(Node localRoot) {
//        if (localRoot != null) {
//            inOrder(localRoot.leftChild);
//            System.out.print(localRoot.iData + " ");
//            inOrder(localRoot.rightChild);
//        }
//    }
//
//    public void postOrder(Node localRoot) {
//        if (localRoot != null) {
//            postOrder(localRoot.leftChild);
//            postOrder(localRoot.rightChild);
//            System.out.print(localRoot.iData + " ");
//        }
//    }
//
//    public boolean delete(int key) {
//        Node current = root;
//        Node parent = root;
//        boolean isLeftChild = true;
//
//        while(current.iData != key) {
//            parent = current;
//            if (key < current.iData) {
//                isLeftChild = true;
//                current = current.leftChild;
//            } else {
//                isLeftChild = false;
//                current = current.rightChild;
//            }
//            if (current == null)
//                return false;
//        }
//        // found node to delete
//
//        // if no children
//        if (current.leftChild == null && current.rightChild == null) {
//            if (current == root)
//                root = null;
//            else if (isLeftChild)
//                parent.leftChild = null;
//            else
//                parent.rightChild = null;
//        }
//        // if no right child, replace with left subtree
//        else if (current.rightChild == null)
//            if (current == root)
//                root = current.leftChild;
//            else if (isLeftChild)
//                parent.leftChild = current.leftChild;
//            else
//                parent.rightChild = current.leftChild;
//        // if no left child, replace with right subtree
//        else if (current.leftChild == null)
//            if (current == root)
//                root = current.rightChild;
//            else if (isLeftChild)
//                parent.leftChild = current.rightChild;
//            else
//                parent.rightChild = current.rightChild;
//        // two children, so replace with inorder successor
//        else {
//
//        }
//
//    }
//
//}
//
//class TreeApp {
//    public static void main(String[] args) {
//        int value;
//        Tree theTree = new Tree();
//    }
//}
