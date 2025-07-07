package behavioral.Visitor;

// 具体访问者
public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ElementA element) {
        System.out.print("访问者访问——");
        element.operationA();
    }

    @Override
    public void visit(ElementB element) {
        System.out.print("访问者访问——");
        element.operationB();
    }
}
