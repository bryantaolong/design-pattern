package behavioral.State;

/**
 * 具体状态A
 *
 * @author: Bryan Long
 */
public class ConcreteStateA implements State {
    @Override
    public void handle(Context context) {
        System.out.println("当前状态：A，切换到B");
        context.setState(new ConcreteStateB());
    }
}
