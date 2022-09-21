package patten.flyweight;

import java.util.HashMap;

/**
 * @author by pepsi-wyl
 * @date 2022-09-21 17:47
 */

// 工厂类  单例工厂
public class BoxFactory {
    private static HashMap<String, AbstractBox> map;

    // 静态加载 进行初始化操作
    static {
        map = new HashMap();
        map.put("I", new IBox());
        map.put("L", new LBox());
        map.put("O", new OBox());
    }

    // 构造方法  私有化
    private BoxFactory() {

    }

    // 获取图像对象
    public static AbstractBox getShape(String name) {
        return map.get(name);
    }

}
