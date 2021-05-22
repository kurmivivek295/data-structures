package stack.examples.commanddp;

import stack.Stack;

public class CommandTest {
    public static void main(String[] args) {
        Stack<Command> commands = new Stack<>();

        Command bold = new Bold();
        bold.execute();
        commands.push(bold);

        Command italic = new Italic();
        italic.execute();
        commands.push(italic);

        Command underline = new Underline();
        underline.execute();
        commands.push(underline);

        Command command = commands.pop();
        command.undo();
        command = commands.pop();
        command.undo();
    }
}
