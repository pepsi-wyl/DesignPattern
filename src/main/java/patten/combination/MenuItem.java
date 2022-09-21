package patten.combination;

/**
 * @author by pepsi-wyl
 * @date 2022-09-20 21:02
 */

// 菜单项 叶子结点
public class MenuItem extends MenuComponent {

    // 构造方法
    public MenuItem(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void println() {
        // 菜单名称
        for (int i = 1; i < level; i++) System.out.print("--");
        System.out.println(name);
    }

}
