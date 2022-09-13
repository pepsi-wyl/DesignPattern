package patten.singleton.demo8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author by pepsi-wyl
 * @date 2022-04-24 13:15
 */

/**
 * 序列化测试
 * 序列化读出来的对象是原来对象的拷贝
 */

public class T {

    public static void main(String[] args) throws Exception {
        writeObjectToFile();
        Singleton s1 = readObjectFromFile();
        Singleton s2 = readObjectFromFile();
        System.out.println(s1.toString() + " " + s2.toString() + " " + (s1 == s2));
    }

    // 从文件中读取对象
    private static Singleton readObjectFromFile() throws Exception {
        //创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        //第一个读取Singleton对象
        Singleton instance = (Singleton) ois.readObject();
        // 关闭输入流
        ois.close();
        return instance;
    }

    // 向文件中写对象
    public static void writeObjectToFile() throws Exception {
        // 获取Singleton类的对象
        Singleton instance = Singleton.getInstance();
        // 创建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        // 将instance对象写出到文件中
        oos.writeObject(instance);
        // 关闭输出流
        oos.close();
    }

}
