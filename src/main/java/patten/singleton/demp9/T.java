package patten.singleton.demp9;

import java.lang.reflect.Constructor;

/**
 * @author by pepsi-wyl
 * @date 2022-04-24 13:39
 */
public class T {
    public static void main(String[] args) throws Exception {

        // 获取反射对象
        Class<Singleton> clazz = Singleton.class;
        // 获取构造器
        Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
        // 取消访问检查  private
        constructor.setAccessible(true);

        // 获取实例对象
        Singleton singleton1 = constructor.newInstance();
        Singleton singleton2 = constructor.newInstance();

        System.out.println(singleton1.toString() + " " + singleton2.toString() + " " + (singleton1 == singleton2));
    }
}
