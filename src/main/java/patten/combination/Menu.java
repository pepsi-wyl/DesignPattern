package patten.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by pepsi-wyl
 * @date 2022-09-20 20:56
 */

// 菜单类 树枝结点
public class Menu extends MenuComponent {

    // 菜单可以有多个子菜单或者子菜单项
    private List<MenuComponent> menuComponentList = new ArrayList<>();

    // 构造方法
    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }

    @Override
    public void println() {
        // 菜单名称
        for (int i = 1; i < level; i++) System.out.print("--");
        System.out.println(name);
        // 子菜单或者子菜单项名称
        for (MenuComponent menuComponent : menuComponentList) menuComponent.println();
    }

}
