package patten.singleton.demo1;

/**
 * @author by pepsi-wyl
 * @date 2022-04-23 19:24
 */

/**
 * 饿汉式 静态成员变量
 */

public class Singleton {

    // 私有构造方法
    private Singleton() {

    }

    // 在本类创建本类对象
    private static Singleton instance = new Singleton();

    // 提供一个公共的访问方式，供外界获取
    public static Singleton getInstance() {
        return instance;
    }

}
