package patten.combination;

/**
 * @author by pepsi-wyl
 * @date 2022-09-20 21:04
 */

// 测试类
public class T {
    public static void main(String[] args) {

        Menu menu1 = new Menu("菜单管理", 2);
        menu1.add(new MenuItem("页面访问", 3));
        menu1.add(new MenuItem("展开菜单", 3));
        menu1.add(new MenuItem("编辑菜单", 3));
        menu1.add(new MenuItem("删除菜单", 3));
        menu1.add(new MenuItem("新增菜单", 3));

        Menu menu2 = new Menu("权限管理", 2);
        menu2.add(new MenuItem("页面访问", 3));
        menu2.add(new MenuItem("提交保存", 3));

        Menu menu3 = new Menu("角色管理", 2);
        menu3.add(new MenuItem("页面访问", 3));
        menu3.add(new MenuItem("新增角色", 3));
        menu3.add(new MenuItem("修改角色", 3));

        Menu menu = new Menu("系统管理", 1);
        menu.add(menu1);
        menu.add(menu2);
        menu.add(menu3);

        // 输出菜单树
        menu.println();
    }
}
