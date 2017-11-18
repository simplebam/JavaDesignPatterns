package observer;

public class ConcreteObserver implements Observer {
    private float temperature;
    private final Subject subject;

    public ConcreteObserver(final Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(final float temperature) {
        this.temperature = temperature;
    }

    @Override
    public void update(final float temperature) {
        this.temperature = temperature;
        System.out.println("ConcreteObserver的temperature:"+temperature);
    }
}