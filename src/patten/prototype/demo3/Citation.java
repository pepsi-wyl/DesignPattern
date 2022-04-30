package patten.prototype.demo3;

import java.io.Serializable;

/**
 * @author by pepsi-wyl
 * @date 2022-04-30 15:21
 */

// 实现Cloneable接口
public class Citation implements Cloneable, Serializable {

    private Student student;

    public Citation() {
    }

    public Citation(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void show() {
        System.out.println(student.getName() + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }
    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

}
