package behavioral.Observer;

/**
 * 具体观察者A
 *
 * @author: Bryan Long
 */
public class ConcreteObserverA implements Observer {
    private Subject subject;

    public ConcreteObserverA(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("观察者A收到状态: " + subject.getState());
    }
}
