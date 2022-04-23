package patten.singleton.demo1;

/**
 * @author by pepsi-wyl
 * @date 2022-04-23 19:26
 */

public class T {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance()==Singleton.getInstance());
    }
}
