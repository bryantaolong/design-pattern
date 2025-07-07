package behavioral.Mediator;

// 具体同事B
public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notifyMsg(String message) {
        System.out.println("同事B收到消息: " + message);
    }
}
