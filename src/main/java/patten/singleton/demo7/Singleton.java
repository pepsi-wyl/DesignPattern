package patten.singleton.demo7;

/**
 * @author by pepsi-wyl
 * @date 2022-04-24 10:36
 */

/**
 * 饿汉式 枚举方式实现
 */

public enum Singleton {
    INSTANCE;

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
