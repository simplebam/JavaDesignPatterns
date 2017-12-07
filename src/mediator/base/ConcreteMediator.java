package mediator.base;

public class ConcreteMediator extends Mediator {
    private ConcreteColleague1 concreteColleague1;
    private ConcreteColleague2 concreteColleague2;

    public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
        this.concreteColleague1 = concreteColleague1;
    }

    public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
        this.concreteColleague2 = concreteColleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (concreteColleague1.getClass().getSimpleName().equals(colleague.getClass().getSimpleName())) {
            concreteColleague1.notifyMessage(message);
        } else if (concreteColleague2.getClass().getSimpleName().equals(colleague.getClass().getSimpleName())) {
            concreteColleague2.notifyMessage(message);

        }
    }
}
