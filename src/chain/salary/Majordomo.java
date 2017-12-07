package chain.salary;

public class Majordomo extends Manager {
    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void reqeustApplication(Request request) {
        if (request.getRequestType().equals("请假") && request.getNumber() <= 5) {
            System.out.println(this.getClass().getSimpleName() + "," + request.getRequstContent()
                    + "被批准" + request.getNumber() + "次");
        } else {
            if (superior != null) superior.reqeustApplication(request);
        }
    }
}
