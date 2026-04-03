package behavioral.Iterator;

/**
 * 客户端
 *
 * @author: Bryan Long
 */
public class Client {
    public static void main(String[] args) {
        Object[] items = {"A", "B", "C"};
        Aggregate aggregate = new ConcreteAggregate(items);
        Iterator iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
