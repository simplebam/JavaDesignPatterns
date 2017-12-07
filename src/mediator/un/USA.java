package mediator.un;

public class USA extends Country {

    public USA(UnitedNations meditor) {
        super(meditor);
    }

    public void declare(String message) {
        meditor.declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("美国获取的消息:" + message);
    }


}
