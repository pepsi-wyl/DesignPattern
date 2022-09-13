package patten.singleton.demo5;

/**
 * @author by pepsi-wyl
 * @date 2022-04-24 10:17
 */

/**
 * 懒汉式  线程安全 双重检查锁
 */

public class Singleton {

    //私有构造方法
    private Singleton() {
    }

    // 声明Singleton类型的变量 volatile 关键字
    private static volatile Singleton instance;

    // 提供一个公共的访问方式，供外界获取
    public static Singleton getInstance() {
        // 第一次判断不为null  不需要抢占锁，直接返回资源
        if (instance == null) {
            // 加锁
            synchronized (Singleton.class) {
                // 抢到锁之后再次判断是否为null
                if (instance == null) instance = new Singleton();
            }
        }
        return instance;
    }

}
