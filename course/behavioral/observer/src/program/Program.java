package program;

import observer.Client;
import observer.IObserver;
import observer.ISubject;
import observer.Restaurant;

public class Program {

    public static void main(String[] args) {
        ISubject subject = new Restaurant("Taj");
        IObserver observer1 = new Client("John Doe");
        IObserver observer2 = new Client("Jane Doe");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.notifyObservers("Discount of 20% for students!");
    }
}
