package behavioral.Observer;

/**
 * 客户端
 *
 * @author: Bryan Long
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer a = new ConcreteObserverA(subject);
        Observer b = new ConcreteObserverB(subject);
        subject.attach(a);
        subject.attach(b);
        subject.setState("状态1");
        subject.setState("状态2");
    }
}
