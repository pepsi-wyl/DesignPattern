package princilies.DIP;

/**
 * @author by pepsi-wyl
 * @date 2022-04-23 16:30
 */

// 硬盘接口
public interface HardDisk {

    // 保存数据
    void save(String data);

    // 获取数据
    String get();

}
