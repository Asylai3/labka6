package Part2;
import java.util.*;
public class SmartHomeRemoteControl {
    private Map<String, Command> slots = new HashMap<>();
    private Command lastCommand;

    public void assign(String button, Command command) {
        slots.put(button, command);
    }

    public void pressButton(String button) {
        Command command = slots.get(button);
        if (command != null) {
            command.execute();
            lastCommand = command;
        } else {
            System.out.println("[Remote] No command assigned to: " + button);
        }
    }

    public void undoLast() {
        if (lastCommand != null) {
            lastCommand.undo();
        } else {
            System.out.println("[Remote] Nothing to undo");
        }
    }
}
