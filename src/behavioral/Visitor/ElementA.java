package behavioral.Visitor;

/**
 * 具体元素A
 *
 * @author: Bryan Long
 */
public class ElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void operationA() {
        System.out.println("元素A的操作");
    }
}
