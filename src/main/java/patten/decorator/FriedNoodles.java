package patten.decorator;

/**
 * @author by pepsi-wyl
 * @date 2022-09-18 17:15
 */

// 炒面 具体构建角色
public class FriedNoodles extends FastFood {
    public FriedNoodles() {
        super(12, "炒面");
    }

    @Override
    public float cost() {
        return super.getPrice();
    }
}
