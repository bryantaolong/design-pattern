package behavioral.Mediator;

/**
 * 抽象同事类
 *
 * @author: Bryan Long
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
