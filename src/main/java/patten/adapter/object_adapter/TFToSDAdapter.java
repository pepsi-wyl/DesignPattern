package patten.adapter.object_adapter;

/**
 * @author by pepsi-wyl
 * @date 2022-05-01 15:52
 */

public class TFToSDAdapter implements SDCard {

    private TFCard tfcard;

    public TFToSDAdapter(TFCard tfcard) {
        this.tfcard = tfcard;
    }

    @Override
    public String readSD() {
        return tfcard.readTF();
    }

    @Override
    public void writeSD() {
        tfcard.writeTF();
    }
}
