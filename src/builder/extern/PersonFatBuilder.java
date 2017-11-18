package builder.extern;

public class PersonFatBuilder extends PersonBuilder {
    @Override
    public void buildHead() {
        System.out.println("胖人的头");
    }

    @Override
    public void buildBody() {
        System.out.println("胖人的身体");

    }

    @Override
    public void buildHand() {
        System.out.println("胖人的手");

    }

    @Override
    public void buildLeg() {
        System.out.println("胖人的脚");
    }
}
