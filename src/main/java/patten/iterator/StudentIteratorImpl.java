package patten.iterator;

import java.util.List;

/**
 * @author by pepsi-wyl
 * @date 2022-09-27 17:59
 */

//  具体迭代器 角色
public class StudentIteratorImpl implements StudentIterator {

    // 集合对象
    private List<Student> students;
    // 集合index位置对象
    private int position = 0;

    public StudentIteratorImpl(List<Student> students) {
        this.students = students;
    }

    // 判断是否还有元素
    @Override
    public boolean hasNext() {
        return position < students.size();
    }

    // 获取下一个元素
    @Override
    public Student next() {
        return students.get(position++);
    }

}
