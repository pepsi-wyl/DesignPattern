package patten.proxy.jdk_proxy;

import java.lang.reflect.Proxy;

/**
 * @author by pepsi-wyl
 * @date 2022-05-01 13:47
 */

// 代理对象工厂 JDK动态代理
public class ProxyFactory<T> {

    // 代理目标对象
    private Object target;

    // 构造方法
    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 获取代理的对象   --->接口类型
    public T getProxy() {
        // ClassLoader loader       类加载器--->用于加载代理类(目标对象)
        // Class<?>[] interfaces    代理类实现接口--->获取代理类实现的接口字节码对象
        // InvocationHandler h      代理对象的调用处理程序
        return (T) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                // lambda表达式   InvocationHandler中的invoke方法
                // proxy  代理的对象
                // method 调用的方法
                // args   调用的方法中实际参数
                // return 返回方法的返回值
                (proxy, method, args) -> {
                    System.out.println("代理对象执行方法");
                    return method.invoke(target, args);
                }
        );
    }
}
