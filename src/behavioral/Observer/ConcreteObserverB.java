package behavioral.Observer;

// 具体观察者B
public class ConcreteObserverB implements Observer {
    private Subject subject;

    public ConcreteObserverB(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("观察者B收到状态: " + subject.getState());
    }
}
