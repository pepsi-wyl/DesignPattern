package patten.visitor.StaticDispatch;

/**
 * @author by pepsi-wyl
 * @date 2022-09-29 10:47
 */

public class T {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Dog();
        Animal a3 = new Cat();

        Execute exe = new Execute();
        exe.execute(a1);
        exe.execute(a2);
        exe.execute(a3);
    }
}
