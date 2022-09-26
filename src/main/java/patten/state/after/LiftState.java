package patten.state.after;

/**
 * @author by pepsi-wyl
 * @date 2022-09-23 16:25
 */

// 抽象状态类
public abstract class LiftState {

    // 声明环境角色类变量
    protected Context context;

    // 设置环境角色类变量
    public void setContext(Context context) {
        this.context = context;
    }

    // 电梯开门动作
    public abstract void open();

    // 电梯关门动作
    public abstract void close();

    // 电梯运行动作
    public abstract void run();

    // 电梯停止动作
    public abstract void stop();

}
