package patten.proxy.jdk_proxy;

import java.lang.reflect.Proxy;

/**
 * @author by pepsi-wyl
 * @date 2022-05-01 13:47
 */

// 代理对象工厂 JDK动态代理
public class ProxyFactory<T> {

    // 目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 获取代理对象
    public T getProxy() {
        return (T) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                // 执行invoke方法
                (proxy, method, args) -> {
                    System.out.println("代理对象执行方法");
                    return method.invoke(target, args);
                }
        );
    }
}
