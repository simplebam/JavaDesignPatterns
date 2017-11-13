/**
 * Created by JZ2292 on 2017/11/11.
 */
public class Father {

    public int num=1;
    public String shout() {
        return "jiao" + getShoutSound()+num;
    }

    protected String getShoutSound() {
        return "";
    }


}
