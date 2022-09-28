package patten.memento.white_box;

/**
 * @author by pepsi-wyl
 * @date 2022-09-28 17:43
 */

// 管理者类
public class RoleStateCaretaker {

    // 聚合备忘录对象
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }

}
