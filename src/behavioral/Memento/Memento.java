package behavioral.Memento;

/**
 * 备忘录
 *
 * @author: Bryan Long
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
