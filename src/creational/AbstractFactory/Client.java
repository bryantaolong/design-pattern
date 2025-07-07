package creational.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        ProductA a1 = factory1.createProductA();
        ProductB b1 = factory1.createProductB();
        a1.use();
        b1.eat();

        AbstractFactory factory2 = new ConcreteFactory2();
        ProductA a2 = factory2.createProductA();
        ProductB b2 = factory2.createProductB();
        a2.use();
        b2.eat();
    }
}
