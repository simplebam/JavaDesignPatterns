package state;


/**
 * 状态模式
 */
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
