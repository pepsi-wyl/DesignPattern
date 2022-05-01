package princilies.DIP;

/**
 * @author by pepsi-wyl
 * @date 2022-04-23 16:39
 */

// 组装计算机
public class TestComputer {
    public static void main(String[] args) {
        Computer computer = new Computer(new XiJieHardDisk(), new IntelCpu(), new KingstonMemory());
        computer.run();
    }
}
