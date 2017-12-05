package singleton;

/**
 * JAVA设计模式之单例模式 - CSDN博客
 * http://blog.csdn.net/jason0539/article/details/23297037/
 */
public class Singleton {
    private static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton (){}
    public static final Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}