package factorymethod;

public class Test {
    public static void main(String... args) {
        IFactory factory = new AddFactory();
        Operate operate = factory.createOperate();
        operate.numA = 2;
        operate.numB = 3;
        System.out.println(operate.getResult());
    }
}
