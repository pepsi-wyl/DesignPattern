package patten.decorator;

/**
 * @author by pepsi-wyl
 * @date 2022-09-18 17:32
 */

// 培根类 具体装饰者角色
public class Bacon extends Garnish {

    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "培根");
    }

    // 计算价格
    @Override
    public float cost() {
        return getPrice() + getFastFood().getPrice();
    }

    // 重写描述
    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
