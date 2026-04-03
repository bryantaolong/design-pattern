package behavioral.Mediator;

/**
 * 具体中介者
 *
 * @author: Bryan Long
 */
public class ConcreteMediator extends Mediator {
    private ConcreteColleagueA colleagueA;
    private ConcreteColleagueB colleagueB;

    public void setColleagueA(ConcreteColleagueA a) {
        this.colleagueA = a;
    }

    public void setColleagueB(ConcreteColleagueB b) {
        this.colleagueB = b;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == colleagueA) {
            colleagueB.notifyMsg(message);
        } else {
            colleagueA.notifyMsg(message);
        }
    }
}
