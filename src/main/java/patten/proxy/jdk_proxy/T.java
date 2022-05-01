package patten.proxy.jdk_proxy;

/**
 * @author by pepsi-wyl
 * @date 2022-05-01 13:58
 */
public class T {
    public static void main(String[] args) {
        SellTickets proxy = new ProxyFactory<SellTickets>(new TrainStation()).getProxy();
        proxy.sell();
        System.out.println(proxy.getClass());
        while (true) {
        }
    }
}
