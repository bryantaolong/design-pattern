package creational.Builder;

/**
 * 具体建造者
 *
 * @author: Bryan Long
 */
public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("部件A");
    }

    @Override
    public void buildPartB() {
        product.setPartB("部件B");
    }

    @Override
    public void buildPartC() {
        product.setPartC("部件C");
    }
}
