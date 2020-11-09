package b懒汉模式;

import java.util.Objects;

/**
 * 单例模式之懒汉模式2——线程安全<br>
 * 作者：徐承恩<br>
 * 邮箱：xuchengen@gmail.com<br>
 * 日期：2020/11/9 2:38 下午<br>
 */
public class Singleton2 {

    private static volatile Singleton2 instance = null;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (Singleton2.class) {
                if (Objects.isNull(instance)) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
