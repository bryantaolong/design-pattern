package behavioral.Interpreter;

import java.util.Map;

/**
 * 变量表达式
 *
 * @author: Bryan Long
 */
public class VariableExpression implements Expression {
    private String name;

    public VariableExpression(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Map<String, Integer> context) {
        return context.getOrDefault(name, 0);
    }
}
