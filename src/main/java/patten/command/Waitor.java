package patten.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by pepsi-wyl
 * @date 2022-09-22 20:45
 */

// 请求者角色
public class Waitor {

    // 持有命令对象
    private List<Command> commands = new ArrayList();

    public void setCommand(Command cmd) {
        commands.add(cmd);
    }

    //发起命令
    public void orderUp() {
        System.out.println("服务员说新的订单来了");
        for (Command command : commands) {
            if (command != null) command.execute();
        }
    }

}
