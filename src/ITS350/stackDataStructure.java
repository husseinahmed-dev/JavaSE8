package ITS350;

/**
 * Created by Hussein on 3/10/16.
 */
public class stackDataStructure {
    private char[] array;
    private int maxSize;
    private int top;

    public stackDataStructure(int maxSize) {
        this.maxSize = maxSize;
        array = new char[maxSize];
        top = -1;
    }

    public void push(char value) {
        array[++top] = value;
    }

    public char pop() {
        return array[top--];
    }

    public char peek() {
        return array[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == array.length - 1);
    }

    public void displayArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
