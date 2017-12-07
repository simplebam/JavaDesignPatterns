package flyweight.website1;

/**
 * 享元模式
 */
public class Test {
    public static void main(String... args) {
        WebsiteFactory factory = new WebsiteFactory();

        Website fx = factory.getWebsiteCategory("产品展示");
        fx.use();

        Website fy = factory.getWebsiteCategory("产品展示");
        fy.use();

        Website fz = factory.getWebsiteCategory("博客");
        fz.use();

        Website fl = factory.getWebsiteCategory("博客");
        fl.use();


    }
}
