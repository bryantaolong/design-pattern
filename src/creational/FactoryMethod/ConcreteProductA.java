package creational.FactoryMethod;

// 具体产品A
public class ConcreteProductA implements Product {
    @Override
    public void use() {
        System.out.println("使用产品A");
    }
}
