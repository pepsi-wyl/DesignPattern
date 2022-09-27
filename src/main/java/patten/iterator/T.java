package patten.iterator;

/**
 * @author by pepsi-wyl
 * @date 2022-09-27 18:11
 */

// 测试类
public class T {
    public static void main(String[] args) {

        // 创建聚合对象
        StudentAggregateImpl studentAggregate = new StudentAggregateImpl();

        // 添加元素
        studentAggregate.addStudent(new Student("wyl", "001"));
        studentAggregate.addStudent(new Student("pepsi-wyl", "002"));
        studentAggregate.addStudent(new Student("zhazha", "003"));
        studentAggregate.addStudent(new Student("bsy", "004"));

        // 遍历聚合对象
        StudentIterator studentIterator = studentAggregate.getStudentIterator();
        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            System.out.println(student);
        }

    }
}
