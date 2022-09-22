package patten.strategy;

/**
 * @author by pepsi-wyl
 * @date 2022-09-22 10:28
 */

// 测试类
public class T {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan();
        // 策略A
        salesMan.setStrategy(new StrategyA());
        salesMan.salesManShow();
        // 策略B
        salesMan.setStrategy(new StrategyB());
        salesMan.salesManShow();
        // 策略C
        salesMan.setStrategy(new StrategyC());
        salesMan.salesManShow();
    }
}
