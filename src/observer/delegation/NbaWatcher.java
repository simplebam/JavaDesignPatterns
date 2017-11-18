package observer.delegation;

//看股票的同事
public class NbaWatcher {

    protected String name;          //该同事的名字
    protected Notifier notifier;        //前台卧底MM

    public NbaWatcher(String name, Notifier notifier) {
        this.name = name;
        this.notifier = notifier;
    }

    public void CloseNbaWatcher(String action) {
        // TODO Auto-generated method stub
        System.out.println(action + name + "别看球赛啦，继续学习");
    }
}