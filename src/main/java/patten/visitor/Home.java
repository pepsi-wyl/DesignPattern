package patten.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by pepsi-wyl
 * @date 2022-09-29 9:35
 */

// 对象结构类
public class Home {

    // 存储元素对象
    private List<Animal> nodeList = new ArrayList<>();

    // 添加元素功能
    public void add(Animal animal) {
        nodeList.add(animal);
    }

    // 执行访问
    public void action(Person person) {
        nodeList.forEach((animal) -> animal.accept(person));
    }

}
