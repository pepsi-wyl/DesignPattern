package patten.state.after;

/**
 * @author by pepsi-wyl
 * @date 2022-09-23 20:25
 */

// 环境角色类
public class Context {

    // 定义对应状态对象的常量
    public final static OpenNingState OPEN_NING_STATE = new OpenNingState();
    public final static CloseNingState CLOSE_NING_STATE = new CloseNingState();
    public final static RunNingState RUN_NING_STATE = new RunNingState();
    public final static StopNingState STOP_NING_STATE = new StopNingState();

    // 当前电梯状态变量
    private LiftState liftState;

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }

}
