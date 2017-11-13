package strategy;

public class ContextFinal {

    private Strategy strategy;

    public ContextFinal(String str) {
        switch (str) {
            case "A":
                strategy = new ConcreteStrategyA();
                break;

            case "B":
                strategy = new ConcreteStrategyB();
                break;

            case "C":
                strategy = new ConcreteStrategyC();
                break;

            default:
                break;

        }
    }


    public void contextInterface() {
        strategy.algorithmInterface();
    }
}
