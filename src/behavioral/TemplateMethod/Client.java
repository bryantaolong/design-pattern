package behavioral.TemplateMethod;

/**
 * 客户端
 *
 * @author: Bryan Long
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass a = new ConcreteClassA();
        a.templateMethod();
        AbstractClass b = new ConcreteClassB();
        b.templateMethod();
    }
}
