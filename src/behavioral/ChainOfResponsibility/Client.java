package behavioral.ChainOfResponsibility;

/**
 *
 *
 * @author: Bryan Long
 */
public class Client {
    public static void main(String[] args) {
        Handler a = new ConcreteHandlerA();
        Handler b = new ConcreteHandlerB();
        Handler c = new ConcreteHandlerC();
        a.setNext(b);
        b.setNext(c);

        a.handleRequest("B");
        a.handleRequest("C");
        a.handleRequest("X");
    }
}
