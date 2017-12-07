package chain.salary;

public class CommonManager extends Manager {
    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void reqeustApplication(Request request) {
        if (request.getRequestType().equals("请假") && request.getNumber() <= 2) {
            System.out.println(this.getClass().getSimpleName() + "," + request.getRequstContent()
                    + "被批准" + request.getNumber() + "次");
        } else {
            if (superior != null) superior.reqeustApplication(request);
        }
    }
}
