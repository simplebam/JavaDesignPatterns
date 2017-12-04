package state;



public class Test {
    public static void main(String... args) {
        Context context = new Context(new ConcreteStateA());

        context.request();
        context.request();
        context.request();
        context.request();
        context.request();
        context.request();




    }
}
