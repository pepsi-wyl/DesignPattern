package princilies.LSP.success;

/**
 * @author by pepsi-wyl
 * @date 2022-04-23 16:11
 */

// 长方形
public class Rectangle implements Quadrilateral {

    // 长和宽
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }

}
