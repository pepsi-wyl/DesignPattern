package patten.responsibility;

/**
 * @author by pepsi-wyl
 * @date 2022-09-23 10:13
 */

// 测试类
public class T {
    public static void main(String[] args) {

        // 请假条
        LeaveRequest leaveRequest = new LeaveRequest("小明", 1, "困");

        // 创建各级领导
        GroupLeader groupLeader = new GroupLeader();
        Manger manger = new Manger();
        GeneralManger generalManger = new GeneralManger();

        // 设置处理链
        groupLeader.setNextHandler(manger);
        manger.setNextHandler(generalManger);

        // 请假
        groupLeader.submit(leaveRequest);
    }
}
