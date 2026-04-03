package structural.Bridge;

/**
 * 客户端
 *
 * @author: Bryan Long
 */
public class Client {
    public static void main(String[] args) {
        Implementor implA = new ConcreteImplementorA();
        Abstraction absA = new RefinedAbstraction(implA);
        absA.operation();

        Implementor implB = new ConcreteImplementorB();
        Abstraction absB = new RefinedAbstraction(implB);
        absB.operation();
    }
}
