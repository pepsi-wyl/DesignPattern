package patten.proxy.jdk_proxy;

/**
 * @author by pepsi-wyl
 * @date 2022-05-01 13:58
 */

// 测试类
public class T {
    public static void main(String[] args) {
        // 获取代理对象
        SellTickets proxy = new ProxyFactory<SellTickets>(new TrainStation()).getProxy();
        // 执行代理对象的售票方法
        proxy.sell();
    }
}
