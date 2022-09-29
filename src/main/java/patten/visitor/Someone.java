package patten.visitor;

/**
 * @author by pepsi-wyl
 * @date 2022-09-29 9:30
 */

// 具体访问者
public class Someone implements Person {
    @Override
    public void feed(Cat cat) {
        System.out.println("其他人喂食猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("其他人喂食狗");
    }

}
