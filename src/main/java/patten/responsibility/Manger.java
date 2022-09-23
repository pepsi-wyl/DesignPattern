package patten.responsibility;

/**
 * @author by pepsi-wyl
 * @date 2022-09-23 9:49
 */

// 部门经理类
public class Manger extends Handler {

    // 调用父类构造函数
    public Manger() {
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    // 处理请假条
    @Override
    protected void handleLeave(LeaveRequest level) {
        System.out.println(level.getName() + "请假" + level.getNum() + "天" + level.getContent());
        System.out.println("部门经理审批......" + (level.getNum() > Handler.NUM_THREE ? "失败" : "成功"));
    }

}
