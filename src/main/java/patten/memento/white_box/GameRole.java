package patten.memento.white_box;

/**
 * @author by pepsi-wyl
 * @date 2022-09-28 17:27
 */

// 发起人角色
public class GameRole {

    /**
     * 内部属性
     */
    private int vit; // 生命力
    private int atk; // 攻击力
    private int def; // 防御力

    // 内部状态初始化
    public void initState() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    // 内部状态战斗后
    public void fitState() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    // 保存状态到备忘录
    public RoleStateMemento saveState() {
        // 封装到备忘录对象中
        return new RoleStateMemento(vit, atk, def);
    }

    // 恢复状态从备忘录
    public void recoverState(RoleStateMemento roleStateMemento) {
        // 从备忘录对象获取数据
        this.vit = roleStateMemento.getVit();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
    }

    /**
     * 展示内部状态
     * toString()
     */
    @Override
    public String toString() {
        return "GameRole{" +
                "生命力=" + vit +
                ", 攻击力=" + atk +
                ", 防御力=" + def +
                '}';
    }

}
