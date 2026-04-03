package behavioral.Mediator;

/**
 * 抽象中介者
 *
 * @author: Bryan Long
 */
public abstract class Mediator {
    public abstract void send(String message, Colleague colleague);
}
