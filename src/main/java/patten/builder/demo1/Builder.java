package patten.builder.demo1;

/**
 * @author by pepsi-wyl
 * @date 2022-04-30 16:13
 */

// 抽象构建者
public abstract class Builder {

    // 聚合Bike对象
    protected Bike bike = new Bike();

    // 创建组件
    public abstract void buildFrame();

    public abstract void buildSeat();

    // 创建Bike
    public abstract Bike createBike();

    // 构建产品方法
    public Bike construct() {
        this.buildFrame();
        this.buildSeat();
        return this.createBike();
    }
}
