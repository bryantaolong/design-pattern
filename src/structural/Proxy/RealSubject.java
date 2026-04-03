package structural.Proxy;

/**
 * 真实主题
 *
 * @author: Bryan Long
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("真实主题的请求");
    }
}
