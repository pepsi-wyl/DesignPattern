package princilies.LSP.success;

/**
 * @author by pepsi-wyl
 * @date 2022-04-23 16:13
 */

public class RectangleDemo {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);
        printLengthAndWidth(rectangle);

        System.out.println("============");

        Square square = new Square();
        square.setSize(10);
//        resize(square);
        printLengthAndWidth(square);

    }

    // 拓展宽方法
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    // 打印长方形的长和宽
    public static void printLengthAndWidth(Quadrilateral quadrilateral) {
        System.out.println("length------>" + quadrilateral.getLength());
        System.out.println("width------>" + quadrilateral.getWidth());
    }

}
