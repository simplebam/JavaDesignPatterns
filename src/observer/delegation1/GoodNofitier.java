package observer.delegation1;

public class GoodNofitier extends Notifier{
    @Override
    public  void notifyx(){
        try {
            getEventHandler().notifyx();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

