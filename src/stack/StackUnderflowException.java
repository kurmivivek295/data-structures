package stack;

public class StackUnderflowException extends RuntimeException {
    public StackUnderflowException(String msg) {
        super(msg);
    }
}
