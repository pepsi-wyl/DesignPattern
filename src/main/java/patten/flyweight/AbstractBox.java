package patten.flyweight;

/**
 * @author by pepsi-wyl
 * @date 2022-09-21 17:41
 */

// 抽象享元角色
public abstract class AbstractBox {

    // 获取图形的方法
    public abstract String getShape();

    // 显示图形及颜色
    public void display(String color) {
        System.out.println("Shape:" + getShape() + " " + "color:" + color);
    }

}
