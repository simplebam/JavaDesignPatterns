package builder;

public class Test {
    public static void main(String... args) {

        Builder builder = new ConcreteBuilderA();
        Director director = new Director();
        director.consturct(builder);

        Product product = builder.getResult();
        product.show();


    }
}
