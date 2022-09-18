package patten.decorator;

/**
 * @author by pepsi-wyl
 * @date 2022-09-18 16:47
 */

// 快餐类   抽象构建角色
public abstract class FastFood {
    private float price;  // 价格
    private String desc;  // 描述

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    // 计算价格方法抽象方法
    public abstract float cost();

}
