package flyweight.website2;


/**
 * 享元模式
 */
public class Test {
    public static void main(String... args) {
        WebsiteFactory factory = new WebsiteFactory();


        Website fx = factory.getWebsiteCategory("产品展示");
        fx.use(new User("小蔡"));

        Website fy = factory.getWebsiteCategory("博客");
        fx.use(new User("老顽童"));



    }
}
