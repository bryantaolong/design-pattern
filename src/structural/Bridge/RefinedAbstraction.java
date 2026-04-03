package structural.Bridge;

/**
 * 扩展抽象部分
 *
 * @author: Bryan Long
 */
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.print("扩展抽象：");
        implementor.operationImpl();
    }
}
