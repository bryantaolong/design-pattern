package behavioral.Mediator;

/**
 * 具体同事A
 *
 * @author: Bryan Long
 */
public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notifyMsg(String message) {
        System.out.println("同事A收到消息: " + message);
    }
}
