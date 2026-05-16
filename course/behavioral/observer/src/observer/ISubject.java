package observer;

public interface ISubject {

    void addObserver(IObserver o);
    void removeObserver(IObserver o);
    void notifyObservers(String message);
}
