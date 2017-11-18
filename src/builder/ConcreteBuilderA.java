package builder;

public class ConcreteBuilderA extends Builder {
    Product product = new Product();


    @Override
    public void buildA() {
        product.add("A");
    }

    @Override
    public void buildB() {
        product.add("B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
