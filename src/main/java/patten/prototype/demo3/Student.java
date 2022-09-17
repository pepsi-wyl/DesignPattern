package patten.prototype.demo3;

import java.io.Serializable;

/**
 * @author by pepsi-wyl
 * @date 2022-04-30 15:27
 */

// 学生类
public class Student implements Serializable {
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
