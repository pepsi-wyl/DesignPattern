package patten.prototype.demo3;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author by pepsi-wyl
 * @date 2022-04-30 15:23
 */

public class CitationTest {

    private static final String path = "G:\\idea\\DesignPattern\\src\\patten\\prototype\\demo3\\obj.txt";

    public static void main(String[] args) throws Exception {

        Citation citation = new Citation();
        citation.setStudent(new Student("pepsi-wyl"));

        // 写入文件
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path));
        outputStream.writeObject(citation);
        outputStream.close();

        //从文件中读入
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path));
        Citation citation1 = (Citation) inputStream.readObject();
        citation.getStudent().setName("zhazha"); // 修改属性

        citation.show();
        citation1.show();

    }
}
