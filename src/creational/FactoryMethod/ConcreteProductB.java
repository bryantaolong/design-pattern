package creational.FactoryMethod;

// 具体产品B
public class ConcreteProductB implements Product {
    @Override
    public void use() {
        System.out.println("使用产品B");
    }
}
