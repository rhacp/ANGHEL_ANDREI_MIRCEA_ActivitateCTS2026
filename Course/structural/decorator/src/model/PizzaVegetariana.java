package model;

import deorator.APizza;

public class PizzaVegetariana extends APizza {

    private String componente;

    private int pret;

    public PizzaVegetariana(String componente, int pret) {
        this.componente = componente;
        this.pret = pret;
    }

    @Override
    public String getComponente() {
        return componente;
    }

    @Override
    public int getPret() {
        return pret;
    }
}
