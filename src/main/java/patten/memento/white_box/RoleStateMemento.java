package patten.memento.white_box;

/**
 * @author by pepsi-wyl
 * @date 2022-09-28 17:31
 */

// 备忘录角色
public class RoleStateMemento {

    /**
     * 内部属性
     */
    private int vit; // 生命力
    private int atk; // 攻击力
    private int def; // 防御力

    // 构造方法初始化备忘录状态
    public RoleStateMemento(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    /**
     * get
     */
    public int getVit() {
        return vit;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

}
