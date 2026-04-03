package behavioral.Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 管理者
 *
 * @author: Bryan Long
 */
public class Caretaker {
    private List<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento m) {
        mementos.add(m);
    }

    public Memento getMemento(int index) {
        return mementos.get(index);
    }
}
