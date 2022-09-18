package patten.adapter.object_adapter;

/**
 * @author by pepsi-wyl
 * @date 2022-05-01 15:52
 */

// 适配者
public class TFToSDAdapter implements SDCard {

    // 聚合TFCard
    private TFCard tfcard;

    public TFToSDAdapter(TFCard tfcard) {
        this.tfcard = tfcard;
    }

    // 类型转化
    @Override
    public String readSD() {
        return tfcard.readTF();
    }

    // 类型转化
    @Override
    public void writeSD() {
        tfcard.writeTF();
    }
}
