package observer.delegation1;

public abstract class Notifier {

    private EventHandler eventHandler=new EventHandler();

    public EventHandler getEventHandler() {
        return eventHandler;
    }

    public  void addListener(Object object,String methodName,Object...args){
        //讲传递进来的参数交由EventHandler,EventHandler交由event处理。
        eventHandler.addEvent(object, methodName, args);
    }
    //具体的实现类规定了何时开始通知观察者。
    public abstract void notifyx();
}

