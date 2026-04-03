package behavioral.Visitor;

/**
 * 访问者接口
 *
 * @author: Bryan Long
 */
public interface Visitor {
    void visit(ElementA element);

    void visit(ElementB element);
}
