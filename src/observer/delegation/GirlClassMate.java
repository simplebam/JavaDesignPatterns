package observer.delegation;

import java.lang.reflect.Method;

public class GirlClassMate extends Notifier {
    private String action;         //通知者发现的情况
    public Method Update;          //反射事件

    //老板发现的情况
    public void setAction(String action) {
        this.action = action;
    }

    public void Notify(Object object) {
        if (Update != null) {
            try {
                Update.invoke(object, action);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}