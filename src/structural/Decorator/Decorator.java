package structural.Decorator;

/**
 * 抽象装饰器
 *
 * @author: Bryan Long
 */
public abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
