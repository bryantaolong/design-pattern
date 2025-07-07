package behavioral.ChainOfResponsibility;

// 具体处理者C
public class ConcreteHandlerC extends Handler {
    @Override
    public void handleRequest(String request) {
        if ("C".equals(request)) {
            System.out.println("C处理了请求");
        } else if (next != null) {
            next.handleRequest(request);
        } else {
            System.out.println("没有人处理请求: " + request);
        }
    }
}
