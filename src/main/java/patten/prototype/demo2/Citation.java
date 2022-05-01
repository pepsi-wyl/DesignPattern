package patten.prototype.demo2;

/**
 * @author by pepsi-wyl
 * @date 2022-04-30 15:21
 */

// 实现Cloneable接口
public class Citation implements Cloneable {

    private String name;

    public Citation() {
    }

    public Citation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name + "同学：在2022学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

}
