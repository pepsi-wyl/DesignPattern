package patten.decorator;

/**
 * @author by pepsi-wyl
 * @date 2022-09-18 17:25
 */

// 鸡蛋类 具体装饰者角色
public class Egg extends Garnish {

    public Egg(FastFood fastFood) {
        super(fastFood,1,"鸡蛋");
    }

    // 计算价格
    @Override
    public float cost() {
        // 快餐价格 装饰者聚合的快餐价格
        return getPrice() + getFastFood().getPrice();
    }

    // 重写描述
    @Override
    public String getDesc() {
        // 快餐描述 装饰者聚合的快餐描述
        return super.getDesc() + getFastFood().getDesc();
    }
}
