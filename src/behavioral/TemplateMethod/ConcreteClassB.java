package behavioral.TemplateMethod;

// 具体类B
public class ConcreteClassB extends AbstractClass {
    @Override
    protected void primitiveOperation1() {
        System.out.println("B实现方法1");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("B实现方法2");
    }
}
