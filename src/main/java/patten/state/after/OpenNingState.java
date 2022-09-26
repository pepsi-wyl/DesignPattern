package patten.state.after;

/**
 * @author by pepsi-wyl
 * @date 2022-09-23 16:26
 */

// 开启状态
public class OpenNingState extends LiftState {

    // 开启
    @Override
    public void open() {
        System.out.println("电梯已经开启......");
    }

    // 关闭
    @Override
    public void close() {
        // 修改状态
        super.context.setLiftState(Context.CLOSE_NING_STATE);
        // 关闭
        super.context.close();
    }

    // 运行
    @Override
    public void run() {
        // 什么都不做
    }

    // 停止
    @Override
    public void stop() {
        // 什么都不做
    }

}
