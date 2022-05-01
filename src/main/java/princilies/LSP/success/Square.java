package princilies.LSP.success;

/**
 * @author by pepsi-wyl
 * @date 2022-04-23 16:10
 */

// 正方形
public class Square implements Quadrilateral {

    // 边长
    private double size;

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double getLength() {
        return size;
    }

    @Override
    public double getWidth() {
        return size;
    }

}
