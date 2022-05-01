package patten.adapter.class_adapter;

/**
 * @author by pepsi-wyl
 * @date 2022-05-01 15:50
 */

public class T {
    public static void main(String[] args) {
        Computer computer = new Computer();

        SDCardImpl sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));
        computer.writeSD(sdCard);

        TFToSDAdapter adapter = new TFToSDAdapter();
        System.out.println(computer.readSD(adapter));
        computer.writeSD(adapter);
    }
}
