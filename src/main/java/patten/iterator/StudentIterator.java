package patten.iterator;

/**
 * @author by pepsi-wyl
 * @date 2022-09-27 17:42
 */

// 抽象迭代器接口 角色
public interface StudentIterator {

    // 判断是否还有元素
    boolean hasNext();

    // 获取下一个元素
    Student next();

}
