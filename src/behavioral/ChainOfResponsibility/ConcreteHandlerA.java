package behavioral.ChainOfResponsibility;

/**
 * 具体处理者A
 *
 * @author: Bryan Long
 */
public class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequest(String request) {
        if ("A".equals(request)) {
            System.out.println("A处理了请求");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}
