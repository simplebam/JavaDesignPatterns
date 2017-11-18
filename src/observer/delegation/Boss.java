package observer.delegation;

public class Boss extends Notifier {

    private String action;         //通知者发现的情况

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