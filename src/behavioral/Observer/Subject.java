package behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

// 主题（被观察者）
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    public String getState() {
        return state;
    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }
}
