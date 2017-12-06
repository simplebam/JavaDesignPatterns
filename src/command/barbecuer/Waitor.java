package command.barbecuer;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Waitor {
    private List<Command> orders = new ArrayList<>();

    public void setOrder(Command command) {
        if (command.getClass().getSimpleName().equals("BakeChickenWingCommand")) {
            System.out.println("服务员:鸡翅没有了,请吃点别的烧烤哈");
        } else {
            orders.add(command);
            System.out.println("增加订单:" + command.toString() + "   时间:" + new Date().toString());
        }
    }

    public void cancelOrder(Command command) {
        orders.remove(command);
        System.out.println("取消订单:" + command.toString() + "   时间:" + new Date().toString());
    }

    public void notifyCommand() {
        for (Command command : orders) {
            command.excuteCommand();
        }
    }
}
