package patten.strategy;

/**
 * @author by pepsi-wyl
 * @date 2022-09-22 10:25
 */

// 环境角色 销售员
public class SalesMan {

    // 聚合策略类对象
    private Strategy strategy;

    public SalesMan() {
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    //向客户展示促销活动
    public void salesManShow() {
        strategy.show();
    }
}
