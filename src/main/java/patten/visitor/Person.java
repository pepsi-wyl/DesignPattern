package patten.visitor;

/**
 * @author by pepsi-wyl
 * @date 2022-09-29 9:22
 */

// 抽象访问者
public interface Person {

    // 喂食宠物猫
    void feed(Cat cat);
    // 喂食宠物狗
    void feed(Dog dog);

}
