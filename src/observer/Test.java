package observer;

/**
 * 观察者模式的应用场景：
 1、 对一个对象状态的更新，需要其他对象同步更新，而且其他对象的数量动态可变。
 2、 对象仅需要将自己的更新通知给其他对象而不需要知道其他对象的细节。
 观察者模式的优点：

 1、 Subject和Observer之间是松偶合的，分别可以各自独立改变。
 2、 Subject在发送广播通知的时候，无须指定具体的Observer，Observer可以自己决定是否要订阅Subject的通知。
 3、 遵守大部分GRASP原则和常用设计原则，高内聚、低偶合。

 观察者模式的缺陷：

 1、 松偶合导致代码关系不明显，有时可能难以理解。(废话)
 2、 如果一个Subject被大量Observer订阅的话，在广播通知的时候可能会有效率问题。（毕竟只是简单的遍历）
 */
public class Test {
    public static void main(String... args) {

        final ConcreteSubject sb = new ConcreteSubject();
        sb.setTemperature((float) 20.00);

        final Observer o = new ConcreteObserver(sb);
        sb.setTemperature((float) 21.00);

    }
}


