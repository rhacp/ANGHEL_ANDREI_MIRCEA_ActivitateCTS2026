package deorator;

public class DecoratorCrown extends APizzaDecorator{

    public DecoratorCrown(APizza pizza) {
        super(pizza);
    }

    @Override
    public String getComponente() {
        return super.getComponente() + ", Crown";
    }

    @Override
    public int getPret() {
        return super.getPret() + 10;
    }
}
