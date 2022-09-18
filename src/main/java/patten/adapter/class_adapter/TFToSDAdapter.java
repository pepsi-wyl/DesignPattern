package patten.adapter.class_adapter;

/**
 * @author by pepsi-wyl
 * @date 2022-05-01 15:52
 */

// 适配器类
public class TFToSDAdapter extends TFCardImpl implements SDCard {
    // 实现SDCard中的方法
    @Override
    public String readSD() {
        // 调用TFCardImpl中的方法
        return super.readTF();
    }

    // 实现SDCard中的方法
    @Override
    public void writeSD() {
        // 调用TFCardImpl中的方法
        super.writeTF();
    }
}
