package operationfactory;

public class Test {
    public static void main(String... args) {
        Operate operate = OperateFactory.createOperate("+");
        operate.setNumA(1);
        operate.setNumA(2);
        System.out.println(operate.getResult());
    }
}
