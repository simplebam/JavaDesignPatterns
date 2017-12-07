package chain.salary;

public class Request {
    //申请类型
    private String requestType;
    //申请内容
    private String requstContent;
    //数量
    private int number;

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequstContent() {
        return requstContent;
    }

    public void setRequstContent(String requstContent) {
        this.requstContent = requstContent;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
