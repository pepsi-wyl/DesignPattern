package patten.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author by pepsi-wyl
 * @date 2022-09-28 20:36
 */

// 环境角色类
public class Context {
    // 存储变量及对应的值
    private Map<Variable, Integer> map = new HashMap();

    // 添加变量
    public void addVariable(Variable var, Integer value) {
        map.put(var, value);
    }

    // 根据变量获取对应的值
    public int getValue(Variable var) {
        return map.get(var);
    }
}
