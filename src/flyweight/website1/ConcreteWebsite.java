package flyweight.website1;

public class ConcreteWebsite extends Website {
    private String name;

    public ConcreteWebsite(String name) {
        this.name = name;
    }

    @Override
    public void use() {
        System.out.println("网站分享:" + name);
    }
}
