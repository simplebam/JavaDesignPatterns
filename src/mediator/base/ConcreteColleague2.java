package mediator.base;

public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void notifyMessage(String message) {
        System.out.println("同事2得到的消息:" + message);
    }

    public void send(String message) {
        mediator.send(message, this);
    }
}
