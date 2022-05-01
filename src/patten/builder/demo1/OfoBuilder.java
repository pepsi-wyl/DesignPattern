package patten.builder.demo1;

/**
 * @author by pepsi-wyl
 * @date 2022-04-30 16:18
 */

// 构建ofo单车
public class OfoBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
