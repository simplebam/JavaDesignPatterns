package observer.delegation;

/**
 * http://blog.csdn.net/XIAXIA__/article/details/41803473
 */
public class MainClass {
    public static void main(String[] args) {

        Notifier tuhao = new Boss();
        NbaWatcher diaosi1 = new NbaWatcher("倒霉的屌丝1", tuhao);
        ComicReader diaosi2 = new ComicReader("幸运的屌丝2", tuhao);

        tuhao.setAction("班主任我回来啦！");

        try {
            tuhao.Update = diaosi1.getClass().getMethod("CloseNbaWatcher", new Class[]{String.class});
        } catch (NoSuchMethodException | SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        tuhao.Notify((Object) diaosi1);

        try {
            tuhao.Update = diaosi2.getClass().getMethod("CloseComicReader", new Class[]{String.class});
        } catch (NoSuchMethodException | SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        tuhao.Notify((Object) diaosi2);
    }
}