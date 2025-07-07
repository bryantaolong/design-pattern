package structural.Composite;

import java.util.ArrayList;
import java.util.List;

// 抽象构件
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component c);

    public abstract void remove(Component c);

    public abstract void display(int depth);
}
