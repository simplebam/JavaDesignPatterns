package observer.delegation1;

import java.util.ArrayList;
import java.util.List;

public class EventHandler {
    private List<Event> objects;

    public EventHandler(){
        objects=new ArrayList<>();

    }

    public void addEvent(Object object,String methodName,Object...args){
        Event event=new Event(object,methodName,args);
        objects.add(event);
    }

    public void notifyx() throws Exception{
        for(Event e:objects){
            // 通过反射调用对应的方法
            e.invoke();
        }
    }
}
