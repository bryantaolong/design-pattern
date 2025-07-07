package behavioral.ChainOfResponsibility;

// 具体处理者B
public class ConcreteHandlerB extends Handler {
    @Override
    public void handleRequest(String request) {
        if ("B".equals(request)) {
            System.out.println("B处理了请求");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}
