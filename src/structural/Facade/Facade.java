package structural.Facade;

// 外观类
public class Facade {
    private SubsystemA a = new SubsystemA();
    private SubsystemB b = new SubsystemB();
    private SubsystemC c = new SubsystemC();

    public void operation() {
        a.operationA();
        b.operationB();
        c.operationC();
    }
}
