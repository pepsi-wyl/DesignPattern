package patten.flyweight;

/**
 * @author by pepsi-wyl
 * @date 2022-09-21 17:44
 */

// IBox类 具体享元角色
public class IBox extends AbstractBox {
    @Override
    public String getShape() {
        return "I";
    }
}
