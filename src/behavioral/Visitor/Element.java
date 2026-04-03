package behavioral.Visitor;

/**
 * 元素接口
 *
 * @author: Bryan Long
 */
public interface Element {
    void accept(Visitor visitor);
}
