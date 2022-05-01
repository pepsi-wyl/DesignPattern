package patten.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * @author by pepsi-wyl
 * @date 2022-05-01 14:45
 */

public class ProxyFactory<T> {

    // 代理目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public T getProxy() {
        Enhancer enhancer = new Enhancer();
        // 父类的字节码对象
        enhancer.setSuperclass(target.getClass());
        // 设置回调函数
        enhancer.setCallback((MethodInterceptor) (o, method, args, methodProxy) -> {
            System.out.println("代理点收取一些服务费用(CGLIB动态代理方式)");
            return methodProxy.invokeSuper(o, args);
        });
        //创建代理对象
        return (T) enhancer.create();
    }
}
