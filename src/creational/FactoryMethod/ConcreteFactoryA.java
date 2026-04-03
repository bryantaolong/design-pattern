package creational.FactoryMethod;

/**
 * 具体工厂A
 *
 * @author: Bryan Long
 */
public class ConcreteFactoryA implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
