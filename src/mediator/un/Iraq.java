package mediator.un;

public class Iraq extends Country {

    public Iraq(UnitedNations meditor) {
        super(meditor);
    }

    public void declare(String message) {
        meditor.declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("伊拉克获取的消息:" + message);
    }


}
