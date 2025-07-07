package behavioral.Iterator;

// 具体迭代器
public class ConcreteIterator implements Iterator {
    private Object[] items;
    private int index = 0;

    public ConcreteIterator(Object[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return index < items.length;
    }

    @Override
    public Object next() {
        return hasNext() ? items[index++] : null;
    }
}
