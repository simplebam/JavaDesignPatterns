package builder;

public class ConcreteBuilderB extends Builder {
    Product product = new Product();


    @Override
    public void buildA() {
        product.add("x");
    }

    @Override
    public void buildB() {
        product.add("y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
