package structural.Bridge;

/**
 * 抽象部分
 *
 * @author: Bryan Long
 */
public abstract class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}
