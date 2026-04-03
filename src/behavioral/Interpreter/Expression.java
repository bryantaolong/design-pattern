package behavioral.Interpreter;

import java.util.Map;

/**
 * 抽象表达式接口
 *
 * @author: Bryan Long
 */
public interface Expression {
    int interpret(Map<String, Integer> context);
}
