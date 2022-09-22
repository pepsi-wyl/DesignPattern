package patten.strategy;

/**
 * @author by pepsi-wyl
 * @date 2022-09-22 10:24
 */

// 具体策略类StrategyB
public class StrategyB implements Strategy {
    @Override
    public void show() {
        System.out.println("满200元减50元");
    }
}
