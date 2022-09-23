package patten.responsibility;

/**
 * @author by pepsi-wyl
 * @date 2022-09-23 9:32
 */

// 抽象处理者
public abstract class Handler {

    // 请假天数
    protected final static int NUM_ZERO = 0;
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    // 处理请假区间
    private int numStart;
    private int numEnd;

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    // 后继者
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // 处理请假的方法
    protected abstract void handleLeave(LeaveRequest level);

    // 提交请假条
    public final void submit(LeaveRequest level) {
        // 处理请假
        this.handleLeave(level);
        // 有后继者并且处理不了天数
        if (this.nextHandler != null && level.getNum() > this.numEnd) {
            // 调用后继者
            this.nextHandler.submit(level);
        }
    }

}
