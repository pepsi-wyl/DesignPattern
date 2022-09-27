package patten.observer.jdk;

/**
 * @author by pepsi-wyl
 * @date 2022-09-27 11:10
 */

public class T {
    public static void main(String[] args) {
        //创建小偷对象
        Thief t = new Thief("隔壁老王");
        //创建警察对象
        Policemen p = new Policemen("小李");
        //让警察盯着小偷
        t.addObserver(p);
        //小偷偷东西
        t.steal();
    }
}