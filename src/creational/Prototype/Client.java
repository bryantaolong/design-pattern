package creational.Prototype;

/**
 * 客户端
 *
 * @author: Bryan Long
 */
public class Client {
    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype("原型1");
        prototype.show();
        Prototype clone = prototype.clone();
        clone.show();
    }
}
