package patten.singleton.demo2;

/**
 * @author by pepsi-wyl
 * @date 2022-04-23 19:29
 */

/**
 * 饿汉式 静态代码块
 */

public class Singleton {

    // 私有构造方法
    private Singleton() {

    }

    // 声明Singleton类型的变量
    private static Singleton instance;

    // 静态代码块中进行赋值
    static {
        instance = new Singleton();
    }

    // 提供一个公共的访问方式，供外界获取
    public static Singleton getInstance() {
        return instance;
    }

}
