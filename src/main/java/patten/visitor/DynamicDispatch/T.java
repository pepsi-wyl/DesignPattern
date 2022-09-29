package patten.visitor.DynamicDispatch;

/**
 * @author by pepsi-wyl
 * @date 2022-09-29 10:51
 */

public class T {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.execute();
        a2.execute();
    }
}
