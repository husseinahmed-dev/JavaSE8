package ITS350;

/**
 * Created by Hussein on 4/18/16.
 */
class Node {
    int iData;          // data used as key value
    double dData;       // other data
    TreeNode leftChild;     // this node's left child
    TreeNode rightChild;    // this node's right child

    public void displayNode() {
        System.out.print("{");
        System.out.print(iData);
        System.out.print(", ");
        System.out.print(dData);
        System.out.print("} ");
    }
}
