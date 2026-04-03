package behavioral.Strategy;

/**
 * 具体策略A
 *
 * @author: Bryan Long
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void algorithm() {
        System.out.println("使用策略A");
    }
}
