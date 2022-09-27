package patten.observer;

/**
 * @author by pepsi-wyl
 * @date 2022-09-27 10:18
 */

// 测试类
public class T {
    public static void main(String[] args) {

        // 创建具体主题角色类
        SubscriptionSubject subject = new SubscriptionSubject();

        // 添加订阅者(观察者)
        subject.attach(new WeiXInUser("pepsi-wyl"));
        subject.attach(new WeiXInUser("zhazha"));
        subject.attach(new WeiXInUser("wyl"));

        // 通知订阅者(观察者)更新消息
        subject.notify("test1");

    }
}
