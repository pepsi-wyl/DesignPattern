package patten.interpreter;

/**
 * @author by pepsi-wyl
 * @date 2022-09-28 20:44
 */

// 减法表达式类
public class Minus extends AbstractExpression {

    // -号 左边表达式
    private AbstractExpression left;
    // -号 右边表达式
    private AbstractExpression right;

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        // 将左边表达式的结果和右边表达式的结果进行相加
        return left.interpret(context) - right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }

}