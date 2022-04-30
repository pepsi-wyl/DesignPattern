package patten.prototype.demo1;

/**
 * @author by pepsi-wyl
 * @date 2022-04-30 15:05
 */

public class Realizetype implements Cloneable {

    public Realizetype() {
        System.out.println("具体的原型对象创建完成！");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }

}
