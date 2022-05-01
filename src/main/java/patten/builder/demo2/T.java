package patten.builder.demo2;

/**
 * @author by pepsi-wyl
 * @date 2022-04-30 18:30
 */
public class T {
    public static void main(String[] args) {
        Phone build = new Phone
                .Builder()
                .cpu("麒麟9000")
                .screen("三星")
                .memory("8G")
                .mainboard("华为")
                .build();
        System.out.println(build);
    }
}
