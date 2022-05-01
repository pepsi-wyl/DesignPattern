package patten.singleton.demo6;

/**
 * @author by pepsi-wyl
 * @date 2022-04-24 10:25
 */

/**
 * 懒汉式  静态内部类
 */

public class Singleton {

    // 私有构造方法
    private Singleton() {
    }

    // 静态内部类
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    // 提供公共的访问方法
    public static Singleton getInstance() {
        // 加载外部类不会加载静态内部类,只有内部类的属性和方法被调用时才加载
        // static只会实例化一次，并且严格保证实例化顺序
        return SingletonHolder.INSTANCE;
    }

}
