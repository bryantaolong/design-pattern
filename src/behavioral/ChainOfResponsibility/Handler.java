package behavioral.ChainOfResponsibility;

// 抽象处理者
/**
 *
 *
 * @author: Bryan Long
 */
public abstract class Handler {
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(String request);
}
