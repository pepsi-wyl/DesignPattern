package patten.singleton.demo6;

/**
 * @author by pepsi-wyl
 * @date 2022-04-24 10:32
 */

public class T {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance()==Singleton.getInstance());
    }
}
