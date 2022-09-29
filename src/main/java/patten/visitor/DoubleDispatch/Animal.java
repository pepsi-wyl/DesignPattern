package patten.visitor.DoubleDispatch;


/**
 * @author by pepsi-wyl
 * @date 2022-09-29 10:57
 */

public class Animal {
    public void accept(Execute exe) {
        exe.execute(this);
    }
}
