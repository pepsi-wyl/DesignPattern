package patten.singleton.demo4;

/**
 * @author by pepsi-wyl
 * @date 2022-04-24 10:12
 */

/**
 * 懒汉式  线程安全 synchronized
 */

public class Singleton {

    //私有构造方法
    private Singleton() {
    }

    // 声明Singleton类型的变量
    private static Singleton instance;

    // 提供一个公共的访问方式，供外界获取
    public static synchronized Singleton getInstance() {
        // 线程安全 加锁 效率低下
        if (instance == null) instance = new Singleton();
        return instance;
    }

}
