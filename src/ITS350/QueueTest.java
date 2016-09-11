package ITS350;

/**
 * Hussein Ahmed ID:13-00312
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue(8);

        queue.enque(10);
        queue.enque(20);
        queue.enque(30);
        queue.displayQueue();

        queue.deque();
        queue.deque();
        queue.displayQueue();

        queue.enque(40);
        queue.enque(50);
        queue.enque(60);
        queue.enque(70);
        queue.displayQueue();

        queue.deque();
        queue.deque();
        queue.deque();
        queue.deque();
        queue.deque();
        queue.displayQueue();

    }
}
