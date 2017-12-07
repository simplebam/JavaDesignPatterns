package flyweight.base;

public class UnsharedConcreteFlyWeight extends FlyWeight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("不共享的具体FlyWeight:" + extrinsicstate);
    }
}
