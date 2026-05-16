package observer;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements ISubject {

    private String name;

    private List<IObserver> observers = new ArrayList<IObserver>();

    public Restaurant(String name) {
        this.name = name;
    }

    @Override
    public void addObserver(IObserver o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (IObserver o : observers) {
            o.getMessage(message);
        }
    }
}
