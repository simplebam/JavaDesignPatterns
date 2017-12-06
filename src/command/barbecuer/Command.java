package command.barbecuer;

/**
 * Created by yueyue on 2017/12/6.
 */
public abstract class Command {
    protected Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    public abstract void excuteCommand();
}
