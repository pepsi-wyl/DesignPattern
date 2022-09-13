package patten.singleton.demo7;

/**
 * @author by pepsi-wyl
 * @date 2022-04-24 10:36
 */

/**
 * 饿汉式 枚举方式实现
 */

public enum Singleton {

    // 枚举类枚举
    INSTANCE;

    // 提供一个公共的访问方式，供外界获取
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
