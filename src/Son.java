/**
 * Created by JZ2292 on 2017/11/11.
 */
public class Son extends Father implements IChange {

    public int num=2;

    @Override
    protected String getShoutSound() {
        return "Son";
    }

    @Override
    public void print(String string) {

    }
}
