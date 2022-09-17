package patten.prototype.demo2;

/**
 * @author by pepsi-wyl
 * @date 2022-04-30 15:23
 */

// 测试类
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建原型对象
        Citation citation = new Citation();
        // 克隆对象
        Citation clone1 = citation.clone();
        Citation clone2 = citation.clone();
        // 给奖状写入名字
        clone1.setName("wyl");
        clone2.setName("pepsi-wyl");
        // 调用方法
        clone1.show();
        clone2.show();
    }
}
