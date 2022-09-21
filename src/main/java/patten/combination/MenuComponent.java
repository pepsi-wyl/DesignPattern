package patten.combination;

/**
 * @author by pepsi-wyl
 * @date 2022-09-20 20:50
 */

// 菜单组件 抽象根结点
public abstract class MenuComponent {

    // 菜单组件的名称
    protected String name;
    // 菜单组件的层级
    protected int level;

    // 添加子菜单
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    // 移除子菜单
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    // 获取指定的子菜单
    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    // 获取菜单或者菜单项的名称
    public String getName() {
        return name;
    }

    // 打印菜单名称(子菜单和菜单项)
    public abstract void println();

}
