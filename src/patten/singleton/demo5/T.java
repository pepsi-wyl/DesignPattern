package patten.singleton.demo5;

/**
 * @author by pepsi-wyl
 * @date 2022-04-24 10:24
 */

public class T {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance()==Singleton.getInstance());
    }
}
