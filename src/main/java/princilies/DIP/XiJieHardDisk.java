package princilies.DIP;

/**
 * @author by pepsi-wyl
 * @date 2022-04-23 16:29
 */

// 希捷硬盘类
public class XiJieHardDisk implements HardDisk {

    // 保存数据
    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据" + data);
    }

    // 获取数据
    public String get() {
        System.out.println("使用希捷希捷硬盘取数据");
        return "数据";
    }

}
