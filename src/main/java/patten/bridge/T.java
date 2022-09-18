package patten.bridge;

/**
 * @author by pepsi-wyl
 * @date 2022-09-18 20:39
 */

// 测试类
public class T {
    public static void main(String[] args) {
        OpratingSystem mac = new Mac(new AviFile());
        mac.play("战狼2");
        OpratingSystem windows = new Windows(new RmvbFile());
        windows.play("战狼2");
    }
}
