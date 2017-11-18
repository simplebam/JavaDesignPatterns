package observer.extern;

/**
 * https://www.cnblogs.com/fingerboy/p/5468994.html
 * 第一步:先调用setChanged()方法,标识状态已经改变的事实.
 * 第二步:调用notifyObservers()方法或者notifyObservers(Object arg),这就牵扯到推(push)和拉(pull)的方式传送数据.
 *       如果想用push的方式"推"数据给观察者,可以把数据当做数据对象传送给notifyObservers(Object arg)方法,其中的arg
 *       可以为任意对象,意思是你可以将任意对象传送给每一个观察者.如果调用不带参数的notifyObserver()方法,则意味着你要
 *       使用pull的方式去主题对象中"拉"来所需要的数据.
 */
public class Test {
    public static void main(String... args) {

        Teacher teacher = new Teacher();
        Student student1 = new Student("张三",teacher);
        Student student2 = new Student("李四",teacher);


        teacher.setHomework("罚抄3000条");

    }
}
