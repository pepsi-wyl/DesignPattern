package princilies.DIP;

import java.util.HashMap;
import java.util.Map;

/**
 * @author by pepsi-wyl
 * @date 2022-04-23 16:33
 */

// 计算机类
public class Computer {

    private HardDisk hardDisk;
    private Cpu cpu;
    private Memory memory;

    public Computer() {
    }

    public Computer(HardDisk hardDisk, Cpu cpu, Memory memory) {
        this.hardDisk = hardDisk;
        this.cpu = cpu;
        this.memory = memory;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    // 开机
    public void run() {
        System.out.println("计算机工作");
        cpu.run();
        memory.save();
        String data = hardDisk.get();
        System.out.println("从硬盘中获取的数据为：" + data);
    }
}
