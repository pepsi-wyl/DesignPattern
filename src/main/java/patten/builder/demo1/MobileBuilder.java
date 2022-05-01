package patten.builder.demo1;

/**
 * @author by pepsi-wyl
 * @date 2022-04-30 16:17
 */

// 构建摩拜单车
public class MobileBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
