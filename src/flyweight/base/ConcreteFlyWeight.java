package flyweight.base;

public class ConcreteFlyWeight extends FlyWeight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("具体FlyWeight:"+extrinsicstate);
    }
}
