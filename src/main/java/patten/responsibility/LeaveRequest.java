package patten.responsibility;

/**
 * @author by pepsi-wyl
 * @date 2022-09-23 9:30
 */

// 请假条类
public class LeaveRequest {

    // 姓名
    private String name;
    // 请假天数
    private int num;
    // 请假内容
    private String content;

    public LeaveRequest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "LeaveRequest{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", content='" + content + '\'' +
                '}';
    }

}
