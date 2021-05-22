package stack.examples.commanddp;

public class Underline implements Command {
    @Override
    public void execute() {
        System.out.println("Execute Underline");
    }

    @Override
    public void undo() {
        System.out.println("Undo Underline");
    }
}
