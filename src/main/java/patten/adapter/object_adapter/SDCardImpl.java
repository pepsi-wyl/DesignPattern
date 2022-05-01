package patten.adapter.object_adapter;

/**
 * @author by pepsi-wyl
 * @date 2022-05-01 15:45
 */

// 目标类
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        return "SDCard read msg:'Hello word SD'";
    }

    @Override
    public void writeSD() {
        System.out.println("往SD卡写数据");
    }
}
