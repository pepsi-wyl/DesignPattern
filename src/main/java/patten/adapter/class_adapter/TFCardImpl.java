package patten.adapter.class_adapter;

/**
 * @author by pepsi-wyl
 * @date 2022-05-01 15:43
 */

// 适配者类
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        return "TFCard read msg:'Hello word TF'";
    }

    @Override
    public void writeTF() {
        System.out.println("往TF卡写数据");
    }
}
