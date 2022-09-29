package patten.visitor;

/**
 * @author by pepsi-wyl
 * @date 2022-09-29 9:24
 */

// 抽象元素
public interface Animal {
    // 接受访问者访问
    void accept(Person person);
}
