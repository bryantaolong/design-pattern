package behavioral.Visitor;

// 访问者接口
public interface Visitor {
    void visit(ElementA element);

    void visit(ElementB element);
}
