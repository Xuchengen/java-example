package b懒汉模式;

import java.util.Objects;

/**
 * 单例模式之懒汉模式1——非线程安全<br>
 * 作者：徐承恩<br>
 * 邮箱：xuchengen@gmail.com<br>
 * 日期：2020/11/9 2:24 下午<br>
 */
public class Singleton1 {

    private static Singleton1 instance = null;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (Objects.isNull(instance)) {
            instance = new Singleton1();
        }
        return instance;
    }

}
