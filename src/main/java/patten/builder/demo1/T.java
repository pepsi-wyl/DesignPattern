package patten.builder.demo1;

/**
 * @author by pepsi-wyl
 * @date 2022-04-30 16:22
 */
public class T {
    public static void main(String[] args) {

        Bike bike = new Director(new MobileBuilder()).construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());

        Bike bike1 = new OfoBuilder().construct();
        System.out.println(bike1.getFrame());
        System.out.println(bike1.getSeat());

    }
}
