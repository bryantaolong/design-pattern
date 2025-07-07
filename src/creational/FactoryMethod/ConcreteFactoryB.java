package creational.FactoryMethod;

// 具体工厂B
public class ConcreteFactoryB implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
