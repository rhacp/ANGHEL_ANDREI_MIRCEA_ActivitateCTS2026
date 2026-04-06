package deorator;

public abstract class APizzaDecorator extends APizza{

    protected APizza pizza;

    public APizzaDecorator(APizza pizza) {
        super();
        this.pizza = pizza;
    }

    @Override
    public String getComponente() {
        return pizza.getComponente();
    }

    @Override
    public int getPret() {
        return pizza.getPret();
    }
}
