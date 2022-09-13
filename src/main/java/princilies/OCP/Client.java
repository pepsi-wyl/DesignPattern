package princilies.OCP;

/**
 * @author by pepsi-wyl
 * @date 2022-04-23 15:25
 */
public class Client {
    public static void main(String[] args) {
        // 皮肤对象
        DefaultSkin defaultSkin = new DefaultSkin();
        NewSkin newSkin = new NewSkin();

        // 输入法对象
        SouGouInput input = new SouGouInput(newSkin);

        // 输入法显示皮肤
        input.display();
    }
}
