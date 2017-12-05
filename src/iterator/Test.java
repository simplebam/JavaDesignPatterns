package iterator;

/**
 * Java设计模式系列之迭代器模式 - 菜鸟奋斗史 - 博客园
 * https://www.cnblogs.com/ysw-go/p/5384516.html
 */
public class Test {
    public static void main(String... args) {

        List list = new ConcreteAggregate();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
