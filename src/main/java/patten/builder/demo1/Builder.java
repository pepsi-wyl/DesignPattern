package patten.builder.demo1;

/**
 * @author by pepsi-wyl
 * @date 2022-04-30 16:13
 */

public abstract class Builder {

    protected Bike bike = new Bike();

    // 创建组件
    public abstract void buildFrame();
    public abstract void buildSeat();

    // 创建实务
    public abstract Bike createBike();

    // 构建产品方法
    public Bike construct() {
        this.buildFrame();
        this.buildSeat();
        return this.createBike();
    }
}
