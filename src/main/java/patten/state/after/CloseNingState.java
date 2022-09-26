package patten.state.after;

/**
 * @author by pepsi-wyl
 * @date 2022-09-23 20:32
 */

// 关闭状态
public class CloseNingState extends LiftState {

    // 开启
    @Override
    public void open() {
        super.context.setLiftState(Context.OPEN_NING_STATE);
        super.context.open();
    }

    // 关闭
    @Override
    public void close() {
        System.out.println("电梯门关闭...");
    }

    // 运行
    @Override
    public void run() {
        super.context.setLiftState(Context.RUN_NING_STATE);
        super.context.run();
    }

    // 停止
    @Override
    public void stop() {
        super.context.setLiftState(Context.STOP_NING_STATE);
        super.context.stop();
    }

}
