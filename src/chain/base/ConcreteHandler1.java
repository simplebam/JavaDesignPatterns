package chain.base;

public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request <= 10) {
            System.out.println(this.getClass().getSimpleName() + "处理了该请求" + request);
        } else {
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}
