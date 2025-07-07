package behavioral.TemplateMethod;

// 抽象类，定义模板方法
public abstract class AbstractClass {
    public void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        hook();
    }

    protected abstract void primitiveOperation1();

    protected abstract void primitiveOperation2();

    protected void hook() {
    }
}
