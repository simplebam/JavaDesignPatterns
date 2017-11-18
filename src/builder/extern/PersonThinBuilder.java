package builder.extern;

public class PersonThinBuilder extends PersonBuilder {
    @Override
    public void buildHead() {
        System.out.println("瘦人的头");
    }

    @Override
    public void buildBody() {
        System.out.println("瘦人的身体");

    }

    @Override
    public void buildHand() {
        System.out.println("瘦人的手");

    }

    @Override
    public void buildLeg() {
        System.out.println("瘦人的脚");
    }
}
