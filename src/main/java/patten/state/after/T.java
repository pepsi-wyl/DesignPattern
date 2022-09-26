package patten.state.after;

/**
 * @author by pepsi-wyl
 * @date 2022-09-26 20:56
 */

// 测试类
public class T {
    public static void main(String[] args) {

        // 创建环境对象
        Context context = new Context();

        // 给环境设置状态
        context.setLiftState(Context.CLOSE_NING_STATE);

        // 进行操作
        context.open();
        context.close();
        context.run();
        context.stop();

    }
}
