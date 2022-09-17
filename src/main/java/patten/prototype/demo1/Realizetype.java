package patten.prototype.demo1;

/**
 * @author by pepsi-wyl
 * @date 2022-04-30 15:05
 */

// 具体原型类
public class Realizetype implements Cloneable {

    // 原型对象构造方法
    public Realizetype() {
        System.out.println("具体的原型对象创建完成！");
    }

    // 重写Clone方法 原型复制方法
    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();   // 强制对象转化
    }

}
