package observer.delegation1;

/**
 作者：夏广成
 链接：http://www.jianshu.com/p/c067410d95ca
 來源：简书
 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Test {
    public static void main(String... args) {

        //委托 观察者
        Notifier notifier=new GoodNofitier();
        DeleObserverA doa=new DeleObserverA();
        DeleObserverB dob=new DeleObserverB();
//        Student studnet=new Student();
//        notifier.addListener(doa, "doaUpdate", new Object[]{123,"spring"});
//        notifier.addListener(dob, "dobUpdate", new Object[]{456,"summer"});
        notifier.addListener(doa, "doaUpdate", 123,"springg");
        notifier.addListener(dob, "dobUpdate", 456,"summerr");

        notifier.notifyx();

    }
}
