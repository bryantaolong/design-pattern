package behavioral.Iterator;

/**
 * 具体聚合
 *
 * @author: Bryan Long
 */
public class ConcreteAggregate implements Aggregate {
    private Object[] items;

    public ConcreteAggregate(Object[] items) {
        this.items = items;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(items);
    }
}
