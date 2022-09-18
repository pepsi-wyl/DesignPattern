package patten.proxy.static_proxy;

/**
 * @author by pepsi-wyl
 * @date 2022-05-01 13:33
 */

// 代售点
public class ProxyPoint implements SellTickets {
    // 火车站
    private TrainStation trainStation = new TrainStation();

    // 卖票
    @Override
    public void sell() {
        System.out.println("代理点收取一些服务费用");
        trainStation.sell(); // 调用火车站买票的方法
    }
}
