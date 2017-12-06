package command.barbecuer;

public class Test {

    public static void main(String... args) {
        Barbecuer boy = new Barbecuer();
        BakeMuttonCommand bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        BakeMuttonCommand bakeMuttonCommand2 = new BakeMuttonCommand(boy);
        BakeChickenWingCommand bakeChickenWingCommand1 = new BakeChickenWingCommand(boy);
        Waitor girl = new Waitor();

        girl.setOrder(bakeMuttonCommand1);
        girl.setOrder(bakeMuttonCommand2);
        girl.setOrder(bakeChickenWingCommand1);
        girl.cancelOrder(bakeMuttonCommand2);

        girl.notifyCommand();




    }
}




