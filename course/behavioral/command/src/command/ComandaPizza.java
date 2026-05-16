package command;

import models.Bucatar;

public class ComandaPizza implements ICommand {

    private String tipPizza;

    private String tipBlat;

    private Bucatar bucatar;

    public ComandaPizza(String tipPizza, String tipBlat, Bucatar bucatar) {
        this.tipPizza = tipPizza;
        this.tipBlat = tipBlat;
        this.bucatar = bucatar;
    }

    @Override
    public void prelucreaza() {
        bucatar.prepararePizza(tipPizza, tipBlat);
    }
}
