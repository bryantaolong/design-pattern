package behavioral.TemplateMethod;

// 具体类A
public class ConcreteClassA extends AbstractClass {
    @Override
    protected void primitiveOperation1() {
        System.out.println("A实现方法1");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("A实现方法2");
    }
}
