package command.base;

public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void excuteCommand() {
        command.excute();
    }
}
