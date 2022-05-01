package patten.builder.demo1;

/**
 * @author by pepsi-wyl
 * @date 2022-04-30 16:22
 */
public class T {
    public static void main(String[] args) {
        // 获得指挥者
        Director director = new Director(new MobileBuilder());
        // 构建自行车
        Bike bike = director.construct();
        // 验证
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());

        Bike bike1 = new OfoBuilder().construct();
        System.out.println(bike1.getFrame());
        System.out.println(bike1.getSeat());

    }
}
