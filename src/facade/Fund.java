package facade;

public class Fund {
    NationalDebt1 nationalDebt1;
    NationalDebt2 nationalDebt2;

    Stock1 stock1;
    Stock2 stock2;
    Stock3 stock3;

    public Fund() {
        nationalDebt1=new NationalDebt1();
        nationalDebt2=new NationalDebt2();

        stock1=new Stock1();
        stock2=new Stock2();
        stock3=new Stock3();
    }

    public void sell() {
        nationalDebt1.sell();
        nationalDebt2.sell();
        stock1.sell();
        stock2.sell();
        stock3.sell();
    }
    public void buy() {
        nationalDebt1.buy();
        nationalDebt2.buy();
        stock1.buy();
        stock2.buy();
        stock3.buy();
    }


}
