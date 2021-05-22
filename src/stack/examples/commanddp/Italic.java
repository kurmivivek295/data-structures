package stack.examples.commanddp;

public class Italic implements Command {
    @Override
    public void execute() {
        System.out.println("Execute Italic");
    }

    @Override
    public void undo() {
        System.out.println("Undo Italic");
    }
}
