package structural.Bridge;

// 具体实现A
public class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("具体实现A的操作");
    }
}
