package facade;

/**
 * 外观模式
 */
public class Test {
    public static void main(String... args) {

        Fund fund = new Fund();
        fund.buy();
        fund.sell();
    }
}
