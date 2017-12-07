package strategy;

/**
 * 策略模式
 */
public class test {

    private static Context context;

    public static void main(String... args) {
        context = new Context(new ConcreteStrategyA());
        context.contextInterface();
        context = new Context(new ConcreteStrategyB());
        context.contextInterface();
        context = new Context(new ConcreteStrategyC());
        context.contextInterface();


    }
}
