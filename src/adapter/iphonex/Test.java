package adapter.iphonex;

/**
 * Java设计模式之适配器模式 - CSDN博客
 *  http://blog.csdn.net/simplebam/article/details/78437774
 */
public class Test {
    public static void main(String... args) {

        TwoPlugs twoPlugs = new TwoPlugs();
        ThreePlugs threePlugs = new AdapterImpl(twoPlugs);
        IPhoneX iPhoneX = new IPhoneX(threePlugs);
        iPhoneX.charge();

    }
}
