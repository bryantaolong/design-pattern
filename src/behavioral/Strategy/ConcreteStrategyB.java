package behavioral.Strategy;

/**
 * 具体策略B
 *
 * @author: Bryan Long
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void algorithm() {
        System.out.println("使用策略B");
    }
}
