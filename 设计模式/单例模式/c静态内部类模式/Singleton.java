package c静态内部类模式;

/**
 * 单例模式之静态内部类模式<br>
 * 作者：徐承恩<br>
 * 邮箱：xuchengen@gmail.com<br>
 * 日期：2020/11/9 2:51 下午<br>
 */
public class Singleton {

    private static class InstanceHolder {

        private static final Singleton instance = new Singleton();

    }

    private Singleton() {

    }

    public static Singleton getInstance() {
        return InstanceHolder.instance;
    }
}
