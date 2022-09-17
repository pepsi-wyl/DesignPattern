package patten.factory.config_factory;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Properties;

/**
 * @author by pepsi-wyl
 * @date 2022-04-30 14:08
 */

// 静态工厂
public class CoffeeFactory {

    // 容器存储咖啡对象
    private static HashMap<String, Coffee> map = new HashMap<>();

    // 加载配置文件，创建咖啡对象
    static {
        // 配置对象
        Properties properties = new Properties();
        try {
            // 加载配置文件
            properties.load(new FileInputStream("src/main/java/patten/factory/config_factory/bean.properties"));
            for (Object key : properties.keySet()) {
                // key
                String coffeeName = (String) key;
                // value
                Coffee coffee = (Coffee) Class.forName(properties.getProperty(coffeeName)).getConstructor().newInstance();
                // 添加Coffee到容器中
                map.put(coffeeName, coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 输出容器
        System.out.println(map.toString());
    }

    // 生产咖啡
    public static Coffee createCoffee(String name) {
        return map.get(name);
    }
}
