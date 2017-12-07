package chain.salary;

public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void reqeustApplication(Request request) {
        if (request.getRequestType().equals("请假")) {
            System.out.println(this.getClass().getSimpleName() + "," + request.getRequstContent()
                    + "被批准" + request.getNumber() + "次");
        } else if (request.getRequestType().equals("加薪") && request.getNumber() <= 500) {
            System.out.println(this.getClass().getSimpleName() + "," + request.getRequstContent()
                    + "被批准,加" + request.getNumber() + "元");
        } else if (request.getRequestType().equals("加薪") && request.getNumber() > 500) {
            System.out.println("加薪超过500元的再说把");
        }
    }
}
