package chain.salary;

public class Test {

    public static void main(String... args) {
        CommonManager commonManager = new CommonManager("普通经理");
        Majordomo majordomo = new Majordomo("总监");
        GeneralManager generalManager = new GeneralManager("总经理");
        commonManager.setSuperior(majordomo);
        majordomo.setSuperior(generalManager);


        Request request1 = new Request();
        request1.setRequestType("请假");
        request1.setRequstContent("小菜请假");
        request1.setNumber(2);
        commonManager.reqeustApplication(request1);

        Request request2 = new Request();
        request2.setRequestType("请假");
        request2.setRequstContent("小菜请假");
        request2.setNumber(4);
        commonManager.reqeustApplication(request2);


        Request request3 = new Request();
        request3.setRequestType("加薪");
        request3.setRequstContent("小菜加薪");
        request3.setNumber(400);
        commonManager.reqeustApplication(request3);


        Request request4 = new Request();
        request4.setRequestType("加薪");
        request4.setRequstContent("小菜加薪");
        request4.setNumber(5000);
        commonManager.reqeustApplication(request4);


    }
}




