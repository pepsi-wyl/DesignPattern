package patten.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * @author by pepsi-wyl
 * @date 2022-05-01 14:45
 */

// 代理工厂
public class ProxyFactory<T> {

    // 代理目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 获取代理对象
    public T getProxy() {
        // 创建Enhancer对象,类似于JDK中的Proxy类
        Enhancer enhancer = new Enhancer();
        // 代理目标对象的字节码对象
        enhancer.setSuperclass(target.getClass());
        // 设置回调函数
        // intercept方法参数说明：
        //            o       代理目标对象
        //            method  真实对象中的方法的Method实例
        //            args    方法的实际参数
        //            methodProxy  代理对象中的方法的method实例
        enhancer.setCallback((MethodInterceptor) (o, method, args, methodProxy) -> {
            System.out.println("代理点收取一些服务费用(CGLIB动态代理方式)");
            return methodProxy.invokeSuper(o, args);
        });
        //返回创建的代理对象
        return (T) enhancer.create();
    }
}
