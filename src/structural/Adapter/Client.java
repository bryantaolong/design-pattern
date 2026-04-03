package structural.Adapter;

/**
 * 客户端
 *
 * @author: Bryan Long
 */
public class Client {
    public static void main(String[] args) {
        // 类适配器
        Target classAdapter = new ClassAdapter();
        classAdapter.request();

        // 对象适配器
        Target objectAdapter = new ObjectAdapter(new Adaptee());
        objectAdapter.request();
    }
}
