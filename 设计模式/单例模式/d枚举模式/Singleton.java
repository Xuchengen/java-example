package d枚举模式;

/**
 * 单例模式之枚举模式<br>
 * 作者：徐承恩<br>
 * 邮箱：xuchengen@gmail.com<br>
 * 日期：2020/11/9 3:11 下午<br>
 */
public class Singleton {

    private enum InstanceHolder {

        INSTANCE;

        private final Singleton singleton;

        InstanceHolder() {
            singleton = new Singleton();
        }

    }

    public static Singleton getInstance() {
        return InstanceHolder.INSTANCE.singleton;
    }
}
