package patten.proxy.cglib_proxy;

/**
 * @author by pepsi-wyl
 * @date 2022-05-01 14:56
 */

public class T {
    public static void main(String[] args) {
        TrainStation proxy = new ProxyFactory<TrainStation>(new TrainStation()).getProxy();
        proxy.sell();
    }
}
