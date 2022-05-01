package princilies.ISP;

/**
 * @author by pepsi-wyl
 * @date 2022-04-23 17:09
 */

// 安全门
public class SafetyDoor implements AntiTheft, Fireproof, Waterproof {

    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireproof() {
        System.out.println("防火");
    }

    @Override
    public void waterproof() {
        System.out.println("防水");
    }

    public static void main(String[] args) {
        SafetyDoor safetyDoor = new SafetyDoor();
        safetyDoor.antiTheft();
        safetyDoor.fireproof();
        safetyDoor.waterproof();
    }

}
