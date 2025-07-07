package creational.FactoryMethod;

// 具体工厂A
public class ConcreteFactoryA implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
