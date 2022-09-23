package patten.responsibility;

/**
 * @author by pepsi-wyl
 * @date 2022-09-23 9:46
 */

// 小组长类
public class GroupLeader extends Handler {

    // 调用父类构造函数
    public GroupLeader() {
            super(Handler.NUM_ZERO, Handler.NUM_ONE);
    }

    // 处理请假条
    @Override
    protected void handleLeave(LeaveRequest level) {
        System.out.println(level.getName() + "请假" + level.getNum() + "天" + level.getContent());
        System.out.println("小组长审批......" + (level.getNum() > Handler.NUM_ONE ? "失败" : "成功"));
    }

}
