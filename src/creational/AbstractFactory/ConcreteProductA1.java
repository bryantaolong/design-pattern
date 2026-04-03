package creational.AbstractFactory;

/**
 * 具体产品A1
 *
 * @author: Bryan Long
 */
public class ConcreteProductA1 implements ProductA {
    @Override
    public void use() {
        System.out.println("使用产品A1");
    }
}
