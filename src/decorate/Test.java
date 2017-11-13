package decorate;

public class Test {

    /**
     * 装饰设计模式个人小理解:
     * 当Student刚刚毕业走出社会的时候,只会Javase,工资不高,接着培训结构可以把你的技能进行升级
     * <p>
     * TrainedMan为什么不直接继承FreshMan重写方法呢?这样耦合性太高了,假如Student改一改,接着HeiMaStudent也要跟着改变
     * 装饰设计模式的好处是耦合性不强,被装饰的类的变化与装饰类的变化无关
     */
    public static void main(String... args) {
        Coder coder = new TrainedMan(new FreshMan());
        coder.code();
    }
}




