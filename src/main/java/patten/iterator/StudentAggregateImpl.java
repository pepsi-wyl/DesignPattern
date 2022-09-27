package patten.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by pepsi-wyl
 * @date 2022-09-27 18:07
 */

// 具体聚合 角色
public class StudentAggregateImpl implements StudentAggregate {

    // 存储Student元素 List集合
    private List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        students.remove(student);
    }

    // 获取迭代器
    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(students);
    }

}
