package ITS350;

/**
 * Hussein Ahmed ID:13-00312
 */
public class Queue {
    private int arraySize;
    private int[] array;
    private int front;
    private int rear;
    private int items;

    public Queue(int arraySize) {
        this.arraySize = arraySize;
        array = new int[arraySize];
        front = 0;
        rear = -1;
        items = 0;
    }

    public void enque(int value) {
        if (rear == arraySize - 1)
            rear = -1;
        array[++rear] = value;
        items++;
    }

    public int deque() {
        int item = array[front++];
        if (front == arraySize)
            front = 0;
        items--;
        return item;
    }

    public int peekFront() {
        return array[front];
    }

    public boolean isEmpty() {
        return (items == 0);
    }

    public boolean isFull() {
        return (items == arraySize);
    }

    public int size() {
        return items;
    }

    public void displayQueue() {
        int frontPrint = front;     // front variable for printing purpose only, so we don't modify the queue

        // if items in queue print them, otherwise print queue is empty
        if (items > 0) {
            // Display upper border
            System.out.printf("%8s", " ");
            for (int i = 0; i < items; i++) {
                System.out.printf("%4s", "----");
            }
            System.out.println();

            // Display queue values, with the arrows
            System.out.print("out <== ");
            for (int i = 0; i < items; i++) {
                System.out.printf("%2d |", array[frontPrint++]);
                if (frontPrint == arraySize) frontPrint = 0;
            }
            System.out.print("<== in");
            System.out.println();

            // Display lower border
            System.out.printf("%8s", " ");
            for (int i = 0; i < items; i++) {
                System.out.printf("%4s", "----");
            }
            System.out.println();
        } else {
            System.out.println("-------------------");
            System.out.println("| Queue is Empty! |");
            System.out.println("-------------------");
        }
    }
}
