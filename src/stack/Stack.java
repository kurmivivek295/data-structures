package stack;

public class Stack <T> {

    public static final int MAX_SIZE = 5;
    Object[] array;
    private int TOP;
    private int size;

    public Stack() {
        array = new Object[MAX_SIZE];
        TOP = -1;
        size = 0;
    }

    public Stack(int intialSize) {
        array = new Object[intialSize];
        TOP = -1;
        size = 0;
    }

    public void push(T element) {
        if (isFull())
            throw new StackOverflowException("Stack is full");

        array[++TOP] = element;
        size++;
    }

    public T pop() {
        if (isEmpty())
            throw new StackUnderflowException("Stack is empty");

        Object element = array[TOP--];
        size--;
        return (T) element;
    }

    public T peek() {
        if (isEmpty())
            throw new StackUnderflowException("Stack is empty");

        return (T) array[TOP];
    }

    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    public boolean isFull() {
        return size == MAX_SIZE ? true : false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String print = "[";
        for (int i = 0; i < size; i++) {
            print = print +  array[i];
            print = print + (i == size - 1 ? "" : ", ");
        }
        print += "]";

        return print;
    }
}
