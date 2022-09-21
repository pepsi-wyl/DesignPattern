package patten.flyweight;

/**
 * @author by pepsi-wyl
 * @date 2022-09-21 17:52
 */

// 测试类
public class T {
    public static void main(String[] args) {
        AbstractBox i = BoxFactory.getShape("I");
        i.display("灰色");
        AbstractBox l = BoxFactory.getShape("L");
        l.display("绿色");
        AbstractBox o = BoxFactory.getShape("O");
        o.display("黄色");
    }
}
