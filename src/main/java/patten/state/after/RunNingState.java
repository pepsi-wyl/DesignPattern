package patten.state.after;

/**
 * @author by pepsi-wyl
 * @date 2022-09-23 20:32
 */

// 运行状态
public class RunNingState extends LiftState {

    // 开启
    @Override
    public void open() {
        //do nothing
    }

    // 关闭
    @Override
    public void close() {
        //do nothing
    }

    // 运行
    @Override
    public void run() {
        System.out.println("电梯正在运行...");
    }

    // 停止
    @Override
    public void stop() {
        super.context.setLiftState(Context.STOP_NING_STATE);
        super.context.stop();
    }

}
