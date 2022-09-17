package patten.prototype.demo3;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author by pepsi-wyl
 * @date 2022-04-30 15:23
 */

// 测试类
public class CitationTest {

    private static final String path = "G:\\idea\\DesignPattern\\src\\main\\java\\patten\\prototype\\demo3\\obj.txt";

    public static void main(String[] args) throws Exception {

        // 创建原型对象
        Citation citation = new Citation();
        citation.setStudent(new Student("test"));

        // 写入文件
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path));
        outputStream.writeObject(citation);
        outputStream.close();

        //从文件中读入
        ObjectInputStream inputStream1 = new ObjectInputStream(new FileInputStream(path));
        Citation citation1 = (Citation) inputStream1.readObject();
        citation1.getStudent().setName("zhazha"); // 修改属性
        ObjectInputStream inputStream2 = new ObjectInputStream(new FileInputStream(path));
        Citation citation2 = (Citation) inputStream2.readObject();
        citation2.getStudent().setName("pepsi-wyl"); // 修改属性

        citation.show();
        citation1.show();
        citation2.show();

    }
}
