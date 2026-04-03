package behavioral.Strategy;

/**
 * 客户端
 *
 * @author: Bryan Long
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.execute();
        context.setStrategy(new ConcreteStrategyB());
        context.execute();
    }
}
