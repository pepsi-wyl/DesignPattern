package patten.iterator;

/**
 * @author by pepsi-wyl
 * @date 2022-09-27 18:03
 */

// 抽象聚合接口 角色
public interface StudentAggregate {

    // 添加学生功能
    void addStudent(Student student);

    // 删除学生功能
    void removeStudent(Student student);

    // 获取迭代器功能
    StudentIterator getStudentIterator();

}
