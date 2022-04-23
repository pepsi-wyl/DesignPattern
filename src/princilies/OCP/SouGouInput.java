package princilies.OCP;

/**
 * @author by pepsi-wyl
 * @date 2022-04-23 15:22
 */


// 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

// 搜狗输入法
public class SouGouInput {

    private final AbstractSkin abstractSkin;

    public SouGouInput(AbstractSkin abstractSkin) {
        this.abstractSkin = abstractSkin;
    }

    public void display() {
        abstractSkin.display();
    }

}
