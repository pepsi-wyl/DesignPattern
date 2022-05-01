package patten.singleton.demo3;

/**
 * @author by pepsi-wyl
 * @date 2022-04-24 10:06
 */

/**
 * 懒汉式  线程不安全
 */

public class Singleton {

    //私有构造方法
    private Singleton() {
    }

    // 声明Singleton类型的变量
    private static Singleton instance;

    // 提供一个公共的访问方式，供外界获取
    public static Singleton getInstance() {
        // 线程不安全 可能同时创建两个对象
        if (instance == null) instance = new Singleton();
        return instance;
    }

}
