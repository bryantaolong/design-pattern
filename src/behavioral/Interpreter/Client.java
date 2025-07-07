package behavioral.Interpreter;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        // 构建表达式：a + b - c
        Expression a = new VariableExpression("a");
        Expression b = new VariableExpression("b");
        Expression c = new VariableExpression("c");
        Expression add = new AddExpression(a, b);
        Expression exp = new SubtractExpression(add, c);

        Map<String, Integer> context = new HashMap<>();
        context.put("a", 10);
        context.put("b", 5);
        context.put("c", 2);

        int result = exp.interpret(context);
        System.out.println("结果: " + result); // 输出13
    }
}
