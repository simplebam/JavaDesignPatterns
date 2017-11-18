package observer.delegation1;

public class DeleObserverB {
    public void dobUpdate(Integer name,String month){
        System.out.println("DeleObserverB 开始更新:"+name+":"+month);
    }
}