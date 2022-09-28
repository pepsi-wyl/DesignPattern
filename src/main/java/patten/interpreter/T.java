package patten.interpreter;

/**
 * @author by pepsi-wyl
 * @date 2022-09-28 20:50
 */

// 测试类
public class T {
    public static void main(String[] args) {
        // 创建环境对象
        Context context = new Context();

        // 创建变量
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");

        // 将变量存储到环境对象中
        context.addVariable(a, 1);
        context.addVariable(b, 2);
        context.addVariable(c, 3);
        context.addVariable(d, 4);

        AbstractExpression expression = new Minus(a,new Plus(new Minus(b,c),d));

        System.out.println(expression + "= " + expression.interpret(context));

    }
}
