package structural.Proxy;

/**
 * 客户端
 *
 * @author: Bryan Long
 */
public class Client {
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.request();
    }
}
