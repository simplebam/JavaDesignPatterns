package simplefactory;

/**
 * 简单工厂模式
 */
public class Test {
    public static void main(String... args) {
        Operate operate = OperateFactory.createOperate("+");
        operate.setNumA(1);
        operate.setNumA(2);
        System.out.println(operate.getResult());
    }
}
