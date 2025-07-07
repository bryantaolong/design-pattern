package structural.Composite;

import java.util.ArrayList;
import java.util.List;

// 容器节点
public class Composite extends Component {
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.println("-".repeat(depth) + name);
        for (Component c : children) {
            c.display(depth + 2);
        }
    }
}
