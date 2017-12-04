package adapter.basketball;

public class Test {
    public static void main(String... args) {
        Forwards forwards = new Forwards("前锋最强者");
        forwards.attack();

        Center center = new Center("中锋最强者");
        center.defense();


        //但姚明是一个中文中锋,听不懂英文,需要翻译
        Translator ym = new Translator("姚明");
        ym.attack();
    }
}
