package patten.adapter.object_adapter;

/**
 * @author by pepsi-wyl
 * @date 2022-05-01 15:41
 */

// 适配者类接口
public interface TFCard {
    // 从TF卡读取数据
    String readTF();

    // 往TF卡中写入数据
    void writeTF();
}
