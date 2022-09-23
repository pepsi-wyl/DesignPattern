package patten.responsibility;

/**
 * @author by pepsi-wyl
 * @date 2022-09-23 9:51
 */

// 总经理类
public class GeneralManger extends Handler {

    // 调用父类构造函数
    public GeneralManger() {
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    // 处理请假条
    @Override
    protected void handleLeave(LeaveRequest level) {
        System.out.println(level.getName() + "请假" + level.getNum() + "天" + level.getContent());
        System.out.println("总经理审批......" + (level.getNum() > Handler.NUM_SEVEN ? "失败" : "成功"));
    }

}