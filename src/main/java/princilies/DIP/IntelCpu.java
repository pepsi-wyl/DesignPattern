package princilies.DIP;

/**
 * @author by pepsi-wyl
 * @date 2022-04-23 16:35
 */

// Intel处理器
public class IntelCpu implements Cpu {

    // CPU执行
    @Override
    public void run() {
        System.out.println("使用Intel处理器");
    }

}
