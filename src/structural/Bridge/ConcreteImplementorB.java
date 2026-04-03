package structural.Bridge;

/**
 * 具体实现B
 *
 * @author: Bryan Long
 */
public class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("具体实现B的操作");
    }
}
