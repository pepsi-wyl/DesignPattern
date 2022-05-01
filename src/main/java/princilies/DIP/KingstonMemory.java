package princilies.DIP;

/**
 * @author by pepsi-wyl
 * @date 2022-04-23 16:37
 */

// KingstonMemory
public class KingstonMemory implements Memory{

    @Override
    public void save() {
        System.out.println("使用金士顿作为内存条");
    }

}
