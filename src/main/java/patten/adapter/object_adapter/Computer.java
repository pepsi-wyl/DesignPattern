package patten.adapter.object_adapter;

/**
 * @author by pepsi-wyl
 * @date 2022-05-01 15:47
 */

// 计算机类
public class Computer {
    // 从SD卡读取数据
    public String readSD(SDCard sdCard) {
        return sdCard.readSD();
    }

    // 往SD卡中写入数据
    public void writeSD(SDCard sdCard) {
        sdCard.writeSD();
    }
}
