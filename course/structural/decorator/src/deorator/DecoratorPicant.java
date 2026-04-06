package deorator;

public class DecoratorPicant extends APizzaDecorator{

    private int nivelIuteala;

    public DecoratorPicant(APizza pizza, int nivelIuteala) {
        super(pizza);
        this.nivelIuteala = nivelIuteala;
    }

    @Override
    public String getComponente() {
        return super.getComponente() + ", iuteala " + nivelIuteala;
    }

    @Override
    public int getPret() {
        return super.getPret() + 15;
    }
}
