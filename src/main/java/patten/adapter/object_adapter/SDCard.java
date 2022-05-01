package patten.adapter.object_adapter;

/**
 * @author by pepsi-wyl
 * @date 2022-05-01 15:44
 */

// 目标类接口
public interface SDCard {
    // 从SD卡读取数据
    String readSD();

    // 往SD卡中写入数据
    void writeSD();
}
