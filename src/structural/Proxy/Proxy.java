package structural.Proxy;

/**
 * 代理主题
 *
 * @author: Bryan Long
 */
public class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        System.out.println("代理前置处理");
        realSubject.request();
        System.out.println("代理后置处理");
    }
}
