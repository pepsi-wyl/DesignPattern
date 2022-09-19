package patten.facade;

/**
 * @author by pepsi-wyl
 * @date 2022-09-19 11:08
 */

// 智能音箱 外观类
public class SmartAppliancesFacade {

    // 聚合对象
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartAppliancesFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    // 语音控制
    public void say(String message) {
        if (message.contains("open")) {
            open();
        } else if (message.contains("close")) {
            close();
        } else {
            System.out.println("我听不懂你说的......");
        }
    }

    // open
    private void open() {
        light.on();
        tv.on();
        airCondition.on();
    }


    // close
    private void close() {
        light.off();
        tv.off();
        airCondition.off();
    }

}
