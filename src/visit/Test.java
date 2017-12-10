package visit;

/**
 * 访问者模式
 */
public class Test {
    public static void main(String... args) {

        ObjectStructure os = new ObjectStructure();
        os.add(new Man());
        os.add(new Woman());

        Success v1 = new Success();
        os.display(v1);

        Failing v2 = new Failing();
        os.display(v2);



    }
}
