package patten.memento.white_box;

/**
 * @author by pepsi-wyl
 * @date 2022-09-28 17:45
 */

// 测试类
public class T {
    public static void main(String[] args) {

        //发起人对象
        GameRole gameRole = new GameRole();
        // 备忘录管理对象
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();

        // 初始化发起人对象属性
        gameRole.initState();
        System.out.println(gameRole);

        // 数据备份
        RoleStateMemento roleStateMemento = gameRole.saveState();
        roleStateCaretaker.setRoleStateMemento(roleStateMemento);

        // 大战发起人对象属性
        gameRole.fitState();
        System.out.println(gameRole);

        // 恢复备份
        gameRole.recoverState(roleStateCaretaker.getRoleStateMemento());
        System.out.println(gameRole);
    }
}
