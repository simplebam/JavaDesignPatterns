package command.barbecuer;

/**
 * Created by yueyue on 2017/12/6.
 */
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void excuteCommand() {
        receiver.bakeMutton();
    }


}
