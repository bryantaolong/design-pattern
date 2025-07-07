package behavioral.Strategy;

// 具体策略A
public class ConcreteStrategyA implements Strategy {
    @Override
    public void algorithm() {
        System.out.println("使用策略A");
    }
}
