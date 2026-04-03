package structural.Composite;

/**
 * 叶子节点
 *
 * @author: Bryan Long
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) { /* 不支持 */ }

    @Override
    public void remove(Component c) { /* 不支持 */ }

    @Override
    public void display(int depth) {
        System.out.println("-".repeat(depth) + name);
    }
}
