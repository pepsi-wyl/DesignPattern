package patten.state.after;

/**
 * @author by pepsi-wyl
 * @date 2022-09-23 20:33
 */

// 停止状态
public class StopNingState extends LiftState {

    // 开启
    @Override
    public void open() {
        super.context.setLiftState(Context.OPEN_NING_STATE);
        super.context.open();
    }

    // 关闭
    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSE_NING_STATE);
        super.context.close();
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
        System.out.println("电梯停止了...");
    }

}