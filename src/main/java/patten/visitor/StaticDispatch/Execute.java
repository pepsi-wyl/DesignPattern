package patten.visitor.StaticDispatch;

/**
 * @author by pepsi-wyl
 * @date 2022-09-29 10:46
 */

public class Execute {
    public void execute(Animal a) {
        System.out.println("Animal");
    }

    public void execute(Dog d) {
        System.out.println("dog");
    }

    public void execute(Cat c) {
        System.out.println("cat");
    }
}
