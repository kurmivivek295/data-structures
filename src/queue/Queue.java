package queue;

public class Queue<T> {
    private Object[] array;
    public static int FRONT = -1;
    public static int REAR = -1;
    public static final int MAX_SIZE = 10;

    public Queue() {
        array = new Object[MAX_SIZE];
    }

    public Queue(int maxSize) {
        array = new Object[maxSize];
    }

    public boolean isEmpty() {
        return FRONT == -1 && REAR == -1;
    }

    public boolean isFull() {
        return FRONT == 0 && REAR == MAX_SIZE - 1;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }

        return REAR - FRONT + 1;
    }

    public void enqueue(T item) {
        if (isFull())
            throw new StackOverflowError("Queue is full");
        if (isEmpty()) {
            array[0] = item;
            FRONT++;
            REAR++;
        }

    }
}
