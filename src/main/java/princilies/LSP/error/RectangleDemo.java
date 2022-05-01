package princilies.LSP.error;

/**
 * @author by pepsi-wyl
 * @date 2022-04-23 15:55
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
        square.setLength(10);
        resize(square);
        printLengthAndWidth(square);

    }

    // 打印长方形的长和宽
    public static void printLengthAndWidth(Rectangle rectangle) {
        System.out.println("length------>" + rectangle.getLength());
        System.out.println("width------>" + rectangle.getWidth());
    }

    // 拓展宽方法
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

}
