package patten.builder.demo1;

/**
 * @author by pepsi-wyl
 * @date 2022-04-30 16:20
 */

// 指挥者
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    // 组装自行车
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }

}
