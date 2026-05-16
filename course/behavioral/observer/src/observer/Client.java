package observer;

public class Client implements IObserver {

    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Client " + this.name + " received message: " + message);
    }
}
