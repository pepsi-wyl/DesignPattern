package patten.observer.jdk;

import java.util.Observable;

/**
 * @author by pepsi-wyl
 * @date 2022-09-27 11:08
 */

public class Thief extends Observable {

    private String name;

    public Thief(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void steal() {
        System.out.println("小偷：我偷东西了，有没有人来抓我！！！");
        super.setChanged();          //changed  = true
        super.notifyObservers();
    }

}
