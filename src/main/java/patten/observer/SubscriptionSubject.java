package patten.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by pepsi-wyl
 * @date 2022-09-27 10:12
 */

// 具体主题角色类
public class SubscriptionSubject implements Subject {

    // 聚合List集合 存储多个观察者对象
    private List<Observer> weiXinUserList = new ArrayList<>();

    // 添加订阅者(观察者)
    @Override
    public void attach(Observer observer) {
        weiXinUserList.add(observer);
    }

    // 删除订阅者(观察者)
    @Override
    public void detach(Observer observer) {
        weiXinUserList.remove(observer);
    }

    // 通知订阅者(观察者)更新消息
    @Override
    public void notify(String message) {
        // 遍历集合
        for (Observer observer : weiXinUserList) {
            observer.update(message);
        }
    }

}
