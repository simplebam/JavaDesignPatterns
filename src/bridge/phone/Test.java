package bridge.phone;

/**
 * 桥接模式
 */
public class Test {
    public static void main(String... args) {

       HandsetBrand ab;
       ab=new HandsetBrandN();

       ab.setHandsetSoft(new HandsetGame());
       ab.run();


       ab.setHandsetSoft(new HandsetAddressList());
       ab.run();





    }
}
