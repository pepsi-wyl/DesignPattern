package patten.visitor.DoubleDispatch;

/**
 * @author by pepsi-wyl
 * @date 2022-09-29 10:59
 */

public class T {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();
        Animal c = new Cat();
        Execute exe = new Execute();
        a.accept(exe);
        d.accept(exe);
        c.accept(exe);
    }
}
