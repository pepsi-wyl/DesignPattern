package patten.facade;

/**
 * @author by pepsi-wyl
 * @date 2022-09-19 11:14
 */

// 测试类
public class T {
    public static void main(String[] args) {
        SmartAppliancesFacade smartAppliancesFacade = new SmartAppliancesFacade();
        smartAppliancesFacade.say("open");
        smartAppliancesFacade.say("close");
        smartAppliancesFacade.say("睡觉");
    }
}
