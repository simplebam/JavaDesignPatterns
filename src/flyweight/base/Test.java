package flyweight.base;

/**
 * 享元模式
 */
public class Test {
    public static void main(String... args) {

        int extrinsicstate = 22;

        FlyWeightFactory factory = new FlyWeightFactory();
        FlyWeight fx = factory.getFlyWeight("X");
        fx.operation(--extrinsicstate);

        FlyWeight fy = factory.getFlyWeight("Y");
        fy.operation(--extrinsicstate);

        FlyWeight fz = factory.getFlyWeight("Z");
        fz.operation(--extrinsicstate);

        UnsharedConcreteFlyWeight uf = new UnsharedConcreteFlyWeight();
        uf.operation(--extrinsicstate);

    }
}
