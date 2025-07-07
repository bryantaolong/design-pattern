package behavioral.State;

// 具体状态B
public class ConcreteStateB implements State {
    @Override
    public void handle(Context context) {
        System.out.println("当前状态：B，切换到A");
        context.setState(new ConcreteStateA());
    }
}
