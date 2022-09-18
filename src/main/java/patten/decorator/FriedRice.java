package patten.decorator;

/**
 * @author by pepsi-wyl
 * @date 2022-09-18 17:11
 */

// 炒饭 具体构建角色
public class FriedRice extends FastFood {
    public FriedRice() {
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        return super.getPrice();
    }
}
