package patten.proxy.static_proxy;

/**
 * @author by pepsi-wyl
 * @date 2022-05-01 13:32
 */

// 火车站
public class TrainStation implements SellTickets {

    // 卖票
    @Override
    public void sell() {
        System.out.println("火车站买票");
    }

}