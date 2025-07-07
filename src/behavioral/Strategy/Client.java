package behavioral.Strategy;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.execute();
        context.setStrategy(new ConcreteStrategyB());
        context.execute();
    }
}
