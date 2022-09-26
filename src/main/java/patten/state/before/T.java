package patten.state.before;

/**
 * @author by pepsi-wyl
 * @date 2022-09-23 15:40
 */

// 测试类
public class T {
    public static void main(String[] args) {
        Lift lift = new Lift();
        lift.setState(ILift.STOPPING_STATE);//电梯是停止的
        lift.open();  //开门
        lift.close(); //关门
        lift.run();   //运行
        lift.stop();  //停止
    }
}
