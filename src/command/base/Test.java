package command.base;

public class Test {

    public static void main(String... args) {
        Receiver receiver = new Receiver();
        ConcreteCommand command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();


        invoker.setCommand(command);
        invoker.excuteCommand();
    }
}




