package princilies.LSP.error;

/**
 * @author by pepsi-wyl
 * @date 2022-04-23 15:54
 */

// 正方形类
public class Square extends Rectangle {

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setLength(width);
        super.setWidth(width);
    }

}
