package structural.Flyweight;

/**
 * 客户端
 *
 * @author: Bryan Long
 */
public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight f1 = factory.getFlyweight("A");
        Flyweight f2 = factory.getFlyweight("B");
        Flyweight f3 = factory.getFlyweight("A");
        f1.operation();
        f2.operation();
        f3.operation();
        System.out.println("f1和f3是否同一对象: " + (f1 == f3));
    }
}
