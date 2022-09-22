package patten.strategy;

/**
 * @author by pepsi-wyl
 * @date 2022-09-22 10:24
 */

// 具体策略类StrategyC
public class StrategyC implements Strategy {
    @Override
    public void show() {
        System.out.println("满1000元加一元换购任意200元以下商品");
    }
}
