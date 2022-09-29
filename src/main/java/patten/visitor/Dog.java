package patten.visitor;

/**
 * @author by pepsi-wyl
 * @date 2022-09-29 9:23
 */

// 具体元素 猫
public class Dog implements Animal {

    // 接受访问者访问 喂食狗
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("好好吃，汪汪汪！！！");
    }

}
