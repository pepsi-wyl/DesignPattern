package patten.visitor;

/**
 * @author by pepsi-wyl
 * @date 2022-09-29 9:32
 */

// 测试类
public class T {
    public static void main(String[] args) {

        // 创建Home对象
        Home home = new Home();

        // 添加元素到home对象中
        home.add(new Cat());
        home.add(new Dog());

        // 给宠物喂食
        home.action(new Owner());
        home.action(new Someone());
    }
}
