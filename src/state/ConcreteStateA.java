package state;

public class ConcreteStateA extends State {
    @Override
    public void Handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
