package behavioral.Visitor;

import java.util.ArrayList;
import java.util.List;

// 对象结构
public class ObjectStructure {
    private List<Element> elements = new ArrayList<>();

    public void add(Element element) {
        elements.add(element);
    }

    public void accept(Visitor visitor) {
        for (Element e : elements) {
            e.accept(visitor);
        }
    }
}
