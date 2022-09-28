package patten.interpreter;

/**
 * @author by pepsi-wyl
 * @date 2022-09-28 20:37
 */

// 变量类
public class Variable extends AbstractExpression {

    // 变量的名称
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        // 直接返回变量的值
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }

}
