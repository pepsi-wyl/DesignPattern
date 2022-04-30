package patten.prototype.demo1;

import patten.prototype.demo1.Realizetype;

/**
 * @author by pepsi-wyl
 * @date 2022-04-30 15:08
 */

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建一个原型类对象
        Realizetype realizetype = new Realizetype();
        // 调用clone方法进行对象的克隆
        Realizetype clone = realizetype.clone();
        // 比较 不是同一个对象
        System.out.println(realizetype == clone);
    }
}
