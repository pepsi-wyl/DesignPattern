package patten.adapter.class_adapter;

/**
 * @author by pepsi-wyl
 * @date 2022-05-01 15:52
 */

public class TFToSDAdapter extends TFCardImpl implements SDCard {

    @Override
    public String readSD() {
        return readTF();
    }

    @Override
    public void writeSD() {
        writeTF();
    }
}
