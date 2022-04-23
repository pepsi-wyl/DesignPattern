package princilies.OCP;

/**
 * @author by pepsi-wyl
 * @date 2022-04-23 15:25
 */
public class Client {
    public static void main(String[] args) {

        DefaultSkin defaultSkin = new DefaultSkin();
        NewSkin newSkin = new NewSkin();

        SouGouInput input = new SouGouInput(newSkin);
        // 显示皮肤
        input.display();
    }
}
