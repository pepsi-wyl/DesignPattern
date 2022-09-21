package patten.flyweight;

/**
 * @author by pepsi-wyl
 * @date 2022-09-21 17:46
 */

// LBox类 具体享元角色
public class LBox extends AbstractBox {
    @Override
    public String getShape() {
        return "L";
    }
}
