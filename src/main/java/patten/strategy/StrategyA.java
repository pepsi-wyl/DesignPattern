package patten.strategy;

/**
 * @author by pepsi-wyl
 * @date 2022-09-22 10:22
 */

// 具体策略类StrategyA
public class StrategyA implements Strategy {
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
