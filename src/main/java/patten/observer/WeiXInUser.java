package patten.observer;

/**
 * @author by pepsi-wyl
 * @date 2022-09-27 10:16
 */

// 具体观察者角色类
public class WeiXInUser implements Observer {

    // 微信用户名
    private String name;

    public WeiXInUser(String name) {
        this.name = name;
    }

    // 更新内容
    @Override
    public void update(String message) {
        System.out.println(name + "_____" + message);
    }

}
