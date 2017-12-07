package mediator.base;

public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void notifyMessage(String message) {
        System.out.println("同事1得到的消息:"+message);
    }

    public void send(String message) {
        mediator.send(message,this);
    }
}
