package behavioral.Visitor;

// 元素接口
public interface Element {
    void accept(Visitor visitor);
}
