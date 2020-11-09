package a饿汉模式;

/**
 * 单例模式之饿汉模式——线程安全<br>
 * 作者：徐承恩<br>
 * 邮箱：xuchengen@gmail.com<br>
 * 日期：2020/11/9 2:58 下午<br>
 */
public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

}
