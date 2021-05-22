package stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        System.out.println(stack.peek());
        stack.push(30);
        stack.push(40);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.push(50);
        stack.push(60);

        System.out.println(stack.toString());
    }
}
