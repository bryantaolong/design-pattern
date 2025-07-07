package structural.Bridge;

// 具体实现B
public class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("具体实现B的操作");
    }
}
