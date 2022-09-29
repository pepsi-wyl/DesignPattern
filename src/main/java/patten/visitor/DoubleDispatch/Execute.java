package patten.visitor.DoubleDispatch;

/**
 * @author by pepsi-wyl
 * @date 2022-09-29 10:58
 */

public class Execute {
    public void execute(Animal animal) {
        System.out.println("animal");
    }

    public void execute(Dog dog) {
        System.out.println("dog");
    }

    public void execute(Cat cat) {
        System.out.println("cat");
    }
}
