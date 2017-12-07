package chain.base;

public class Test {

    public static void main(String... args) {
        ConcreteHandler1 handler1 = new ConcreteHandler1();
        ConcreteHandler2 handler2 = new ConcreteHandler2();
        ConcreteHandler3 handler3 = new ConcreteHandler3();
        handler1.setHandler(handler2);
        handler2.setHandler(handler3);


        int[] request = {1, 11, 21, 3};
        for (int i : request) {
            handler1.handleRequest(i);
        }

    }
}




