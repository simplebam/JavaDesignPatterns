package observer.delegation;

//看世界杯的同事
public class ComicReader {

    protected String name;          //该同事的名字
    protected Notifier notifier;        //前台卧底MM

    public ComicReader(String name, Notifier notifier) {
        this.name = name;
        this.notifier = notifier;
    }

    public void CloseComicReader(String action) {
        // TODO Auto-generated method stub
        System.out.println(action + name + "别看漫画啦，继续学习");
    }
}