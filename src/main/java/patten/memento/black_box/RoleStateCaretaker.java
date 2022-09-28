package patten.memento.black_box;

/**
 * @author by pepsi-wyl
 * @date 2022-09-28 18:05
 */

// 管理者类
public class RoleStateCaretaker {

    // 聚合备忘录对象
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
